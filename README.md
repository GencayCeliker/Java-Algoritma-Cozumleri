# Java ile Algoritma Geliştirme ve Problem Çözme ☕

![Java](https://img.shields.io/badge/Language-Java-orange) ![Status](https://img.shields.io/badge/Status-Completed-green) ![Education](https://img.shields.io/badge/Focus-Algorithms-blue)

Bu depo, üniversitede **Bilgisayar Programcılığı** dersi kapsamında **İmdat Köksal** hocamız tarafından verilen kapsamlı algoritma ödevinin ([`GENEL_ÖDEV.pdf`](GENEL_%C3%96DEV.pdf)) Java ile yazılmış çözümlerini içerir.

Ödev; temel programlama mantığından başlayıp matrisler, klavye etkileşimi, dosya işlemleri ve mantık sorularına uzanan **7 seviyeden** oluşur. Toplam **63 Java dosyası** vardır ve hepsi JDK 17+ ile hatasız derlenir.

---

## 🎯 Kazanımlar

* **Temel yapılar:** Değişkenler, `if-else`, `switch`, operatörler
* **Döngüler ve matematik:** `for` / `while` ile seriler, faktöriyel, asal sayılar, basamak işlemleri
* **String işlemleri:** Karakter sayma, ters çevirme, arama, ASCII dönüşümleri
* **Matrisler:** 3x3 matris toplama, transpoz, satır/sütun toplamları
* **Klavye ve ekran (Swing):** `JFrame` + `KeyListener` ile tuş yakalama, daktilo, koordinata yazı yazma, labirent oyunu
* **Dosya işlemleri (I/O):** `.txt` dosyasına yazma, sonuna ekleme, okuma, kelime arama; `RandomAccessFile`
* **Rastgelelik:** `Random` ile sayı üretimi ve oyun senaryoları

---

## 📂 Klasör Yapısı

| Klasör | Paket | Konu | Dosyalar |
| :--- | :--- | :--- | :--- |
| 📁 `Seviye1` | *(paket yok)* | Temel giriş-çıkış, en küçük/en büyük, renkli konsol yazısı | `soru1–4`, `renkliyaz` |
| 📁 `Seviye2` | `Seviye2` | Döngüler ve matematiksel algoritmalar | `soru1–15`, `soruasal` |
| 📁 `seviye3` | `seviye3` | String işlemleri | `soru1–17`, `soru17_1` |
| 📁 `seviye4` | `seviye4` | Matrisler ve sınıf listesi | `soru1–5` |
| 📁 `seviye5` | `seviye5` | Klavye/ekran uygulamaları – **Swing penceresi açar** | `soru1–5` |
| 📁 `seviye6` | `seviye6` | Dosya işlemleri | `soru1–5`, `datoku` |
| 📁 `seviye7` | `seviye7` | Mantık ve sayı problemleri | `soru1–3`, `soru6–9`, `Soru10` |

> Dosya adları küçük harfle başlar (`soru1.java`); yalnızca `seviye7/Soru10.java` büyük harfle başlar. Java büyük/küçük harfe duyarlıdır, komutları aşağıdaki gibi yazın.

---

## 🛠️ Kurulum ve Çalıştırma

### Gereksinimler

* **JDK 17** veya üzeri (`java -version` ile kontrol edin)
* İsteğe bağlı: IntelliJ IDEA, Eclipse veya VS Code (*Extension Pack for Java*)

### 1. Projeyi indirin

```bash
git clone https://github.com/GencayCeliker/Java-Algoritma-Cozumleri.git
cd Java-Algoritma-Cozumleri
```

### 2. Bir soruyu derleyip çalıştırın

Komutları **depo kök klasöründe** çalıştırın. Türkçe karakterler için `-encoding UTF-8` kullanın.

**Paketli seviyeler (Seviye2 – seviye7):**

```bash
javac -encoding UTF-8 -d out Seviye2/soru1.java
java -cp out Seviye2.soru1
```

```bash
javac -encoding UTF-8 -d out seviye7/Soru10.java
java -cp out seviye7.Soru10
```

**Seviye1 (paketsiz):**

```bash
javac -encoding UTF-8 -d out Seviye1/soru1.java
java -cp out soru1
```

### 3. Notlar

* **seviye5** soruları konsol değil, küçük bir **Swing penceresi** açar. Tuşlara basmadan önce pencereye tıklayıp odağı verin.
* **seviye6** soruları dosyaları **programı çalıştırdığınız klasörde** oluşturur ve okur (`sayilar.txt`, `ogrenci.txt`, `Yeni Metin Belgesi.txt`, `records.dat`). `soru1` ve `soru4` için önce o klasöre bir `.txt` dosyası koyun.
* Windows konsolunda Türkçe karakterler bozuk görünürse önce `chcp 65001` çalıştırın.
* IDE ile çalıştırmak için klasörü açıp ilgili dosyada **Run**'a basmanız yeterlidir.

---

## 📝 Lisans ve Referans

* **Orijinal sorular:** İmdat Köksal (Bilgisayar Mühendisi) – [`GENEL_ÖDEV.pdf`](GENEL_%C3%96DEV.pdf)
* **Çözümler:** Gencay Çeliker
* Eğitim amaçlıdır ve [MIT](LICENSE) lisansı ile açık kaynak olarak paylaşılmıştır.

---
⭐ *Bu projeyi faydalı bulduysanız sağ üst köşeden yıldız vermeyi unutmayın!*
