import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputDescriptionMap = bufferedReader.readLine();
        int baris = Integer.parseInt(inputDescriptionMap.split(" ")[0]);
        int kolom = Integer.parseInt(inputDescriptionMap.split(" ")[1]);
        int timeJump = Integer.parseInt(inputDescriptionMap.split(" ")[2]);

        String[] inputDetailMap = new String[baris];
        String[][] detailMap = new String[baris][kolom];
        int barisIndexStart = 0, kolomIndexStart = 0;
        int barisIndexDestination = 0, kolomIndexDestination = 0;
        for (int a = 0; a < inputDetailMap.length; a++) {
            inputDetailMap[a] = bufferedReader.readLine();
            for (int b = 0; b < inputDetailMap[a].length(); b++) {
                detailMap[a][b] = String.valueOf(inputDetailMap[a].charAt(b));
                if (detailMap[a][b].equalsIgnoreCase("S")) {
                    barisIndexStart = a;
                    kolomIndexStart = b;
                } else if (detailMap[a][b].equalsIgnoreCase("T")) {
                    barisIndexDestination = a;
                    kolomIndexDestination = b;
                }
            }
        }

        // Verification input
        /*System.out.println("baris: " + baris);
        System.out.println("kolom: " + kolom);
        System.out.println("timeJump: " + timeJump + "\n");
        for (String[] itemDetailMap : detailMap) {
            for (int b = 0; b < itemDetailMap.length; b++) {
                System.out.print(itemDetailMap[b]);
            }
            System.out.println();
        }*/

        // Process
        int totalTimeJump = 0;
        boolean isTeleport = false;
        List<Integer> historyBaris = new ArrayList<>();
        List<Integer> historyKolom = new ArrayList<>();
        String kar = "";

        // direction = 1 (atas); 2 (kanan); 3 (bawah); 4 (kiri)
        int direction = 1;
        int barisIndexStartTemp = barisIndexStart;
        int kolomIndexStartTemp = kolomIndexStart;
        while (true) {
            switch (direction) {
                case 1:
                    if (barisIndexStartTemp - 1 < 0) {
                        direction = 2;
                    } else if (isTeleport) {

                    } else {
                        kar = detailMap[barisIndexStartTemp - 1][kolomIndexStart];
                        if (kar.equals(".")) {
                            boolean isBackward = checkBackward(direction, historyBaris, historyKolom, barisIndexStart, kolomIndexStart);
                            if (isBackward) {
                                barisIndexStart = historyBaris.get(historyBaris.size() - 1);
                                kolomIndexStart = historyKolom.get(historyKolom.size() - 1);
                                removeLastHistory(historyBaris, historyKolom);
                                direction = 4;
                            } else {
                                historyBaris.add(barisIndexStart);
                                historyKolom.add(kolomIndexStart);
                                barisIndexStart--;
                            }
                        } else if (kar.equalsIgnoreCase("o")) {
                            historyBaris.add(barisIndexStart);
                            historyKolom.add(kolomIndexStart);
                            barisIndexStart--;
                            isTeleport = true;
                        } else if (kar.equals("#")) {
                            direction = 2;
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }
    }

    private static void removeLastHistory(List<Integer> historyBaris, List<Integer> historyKolom) {
        historyBaris.remove(historyBaris.size() - 1);
        historyKolom.remove(historyKolom.size() - 1);
    }

    private static boolean checkBackward(int direction, List<Integer> historyBaris, List<Integer> historyKolom, int barisIndexStart, int kolomIndexStart) {
        int barisIndexStartTemp = barisIndexStart;
        int kolomIndexStartTemp = kolomIndexStart;
        if (historyBaris.size() == 0 && historyKolom.size() == 0) {
            return false;
        } else {
            switch (direction) {
                case 1:
                    barisIndexStartTemp--;
                    break;
                case 2:
                    kolomIndexStartTemp++;
                    break;
                case 3:
                    barisIndexStartTemp++;
                    break;
                case 4:
                    kolomIndexStartTemp--;
            }
            int lastHistoryBaris = historyBaris.get(historyBaris.size() - 1);
            int lastHistoryKolom = historyKolom.get(historyKolom.size() - 1);
            return lastHistoryBaris == barisIndexStartTemp && lastHistoryKolom == kolomIndexStartTemp;
        }
    }
}
