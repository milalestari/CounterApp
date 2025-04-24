# CounterApp 🧮

Aplikasi Android sederhana yang dibuat dengan Java dan Android Studio, berfungsi untuk menghitung nilai angka dengan tombol tambah dan kurang.

---

## 📱 Tampilan Aplikasi

| Layar Utama |
|-------------|
| ![Screenshot Aplikasi](screenshot.png) |

---

## 🎯 Fitur Aplikasi

- ➕ Menambah angka dengan tombol "Tambah (+)"
- ➖ Mengurangi angka dengan tombol "Kurang (-)"
- 📱 Tampilan antarmuka yang simpel dan mudah digunakan

---

## 🧪 Pengujian

Aplikasi ini dilengkapi dengan pengujian sebagai berikut:

- ✅ **Unit Test**  
  Menguji fungsi logika `increment` dan `decrement` di class `CalculatorTest.java`.

- 🧪 **Instrumentation Test (UI Test)**  
  Menggunakan Espresso untuk menguji interaksi pengguna pada `MainActivityTest.java`.

---

## 🧰 Teknologi yang Digunakan

- Bahasa Java
- Android Studio
- AndroidX Libraries (AppCompat, ConstraintLayout, Material Components)
- JUnit & Espresso (untuk pengujian)

---

## 📁 Struktur Proyek

CounterApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── counterapp/
│   │   │   │               ├── MainActivity.java
│   │   │   │               └── Calculator.java
│   │   │   └── res/
│   │   │       └── layout/
│   │   │           └── activity_main.xml
│   │   ├── test/
│   │   │   └── java/
│   │   │       └── com/
│   │   │           └── example/
│   │   │               └── counterapp/
│   │   │                   └── CalculatorTest.java
│   │   └── androidTest/
│   │       └── java/
│   │           └── com/
│   │               └── example/
│   │                   └── counterapp/
│   │                       └── MainActivityTest.java
│
├── build.gradle
├── settings.gradle
└── README.md

---

## 👩‍💻 Dibuat Oleh

**Mila Lestari**  
NPM: 2208107010002  
Program Studi Informatika – Universitas Syiah Kuala

---

## 🚀 Cara Menjalankan Aplikasi

1. Clone repository ini ke komputer Anda
2. Buka dengan Android Studio
3. Jalankan pada emulator atau perangkat Android fisik

---

## 📃 Lisensi

Proyek ini bersifat open-source dan bebas digunakan untuk keperluan pembelajaran dan akademik.

---

