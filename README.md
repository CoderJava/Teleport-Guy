# Teleport-Guy
Test Programmer

# Dekripsi
John sedang mengembangkan aplikasi game baru berjudul "Teleport Guy". Game tersebut adalah game dengan kategori puzzle dimana pemain akan berada di posisi awal dari suatu peta dan harus mencapai posisi tujuan dalam waktu secepat mungkin. Karena John baru pertama kali membuat game, ia meminta bantuan anda.

Di dalam game tersebut, pemain akan diperlihatkan sebuah peta berukuran NxM yang di dalamnya terdapat:

Posisi awal pemain yang dilambangkan dengan huruf S.
Posisi tujuan yang dilambangkan dengan huruf T.
Teleport pod yang dilambangkan dengan huruf o.
Tanah kosong yang dilambangkan dengan karakter ..
Dinding yang dilambangkan dengan karakter #.
Untuk mencapai posisi tujuan, pemain bisa melangkah ke atas, bawah, kiri, atau kanan 1 petak dalam waktu 1 detik. Perlu diperhatikan bahwa pemain tidak bisa melangkah menuju dinding atau melangkah secara diagonal. Jika pemain sedang berada di suatu teleport pod, ia bisa melakukan jump menuju ke teleport pod lain jika kedua teleport pod memiliki baris/kolom yang sama. Waktu yang dibutuhkan untuk melakukan satu kali jump adalah P detik.

Karena John sangat sibuk sehingga ia tidak punya waktu untuk mencoba peta yang dibuatnya. Maka dari itu ia meminta bantuan anda untuk menentukan apakah pemain dapat mencapai posisi tujuan, jika iya bantulah ia juga untuk mencari waktu minimal yang dibutuhkan pemain untuk mencapai posisi tujuan.

**Format Masukan**

Baris pertama berisi 3 buah bilangan bulat N, M dan P, yang menyatakan ukuran peta dan waktu yang diperlukan untuk melakukan sekali jump. N baris berikutnya berisi M buah karakter S, T, o, ., atau #.

**Format Keluaran**

Keluarkan sebuah angka yang menandakan waktu minimal yang dibutuhkan pemain(dalam detik) untuk mencapai posisi tujuan. Jika pemain tidak dapat mencapai posisi tujuan, keluarkan -1.

**Contoh Masukan 1**
```
3 3 2
..T
S..
...
```

**Contoh Keluaran 1**
```
3
```


**Contoh Masukan 2**
```
4 4 2
#..S
o#o.
#.#.
..T#
```

**Contoh Keluaran 2**
```
-1
```


**Contoh Masukan 3**
```
5 4 4
#..S
o#o.
#.#.
o.T#
....
```

**Contoh Keluaran 3**
12


**Batasan**
Dijamin hanya terdapat satu karakter S dan satu karakter T

**Subtask 1: (10 Poin)**
```
2 ≤ N, M ≤ 100
1 ≤ P ≤ 100
Tidak terdapat karakter o dan # dalam peta
```
 
**Subtask 2: (10 Poin)**
```
2 ≤ N, M ≤ 100
1 ≤ P ≤ 100
Tidak terdapat karakter o dalam peta
```

**Subtask 3: (20 Poin)**
```
2 ≤ N, M ≤ 100
1 ≤ P ≤ 100
```

**Subtask 4: (60 Poin)**
```
2 ≤ N, M ≤ 1000
1 ≤ P ≤ 100
```

# Output
### Test Case 1
![alt text](https://i.imgur.com/FYi4zWI.png "Test Case 1")

### Test Case 2
![alt text](https://i.imgur.com/rTrGd3h.png "Test Case 2")

### Test Case 3
![alt text](https://i.imgur.com/cmWi5HV.png "Test Case 3")
