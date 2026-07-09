# Spring Boot JWT Auth System 🔐

Bu proje, modern web ve mobil uygulamalarda **Stateless (Durumsuz)** mimariyi temel alan güvenli bir kimlik doğrulama sistemi örneğidir. Proje, özellikle kullanıcı oturumlarının yönetimi ve token güvenliği konularına odaklanmaktadır.

### 🛠 Kullanılan Teknolojiler
* **Java 17 & Spring Boot 3.5.16**
* **Spring Security & JJWT (0.12.6)**
* **Spring Data JPA & PostgreSQL**
* **Lombok & Validation**

### 🚀 Neler Yapıldı?
Bu projeyi geliştirirken arka uç (backend) geliştirme standartlarını gözeterek şu teknikleri uyguladım:

* **JWT (JSON Web Token) Implementasyonu:** Kullanıcı girişi sonrası güvenli `Access Token` üretimi.
* **Refresh Token Mekanizması:** Kısa ömürlü erişim anahtarları ile güvenlik sağlanırken, kullanıcı deneyimini bozmayan yedek anahtar (Refresh Token) yapısı.
* **Katmanlı Mimari (Layered Architecture):** `Controller`, `Service`, `Repository` ve `DTO` ayrımı sayesinde kodun sürdürülebilirliği ve test edilebilirliği artırıldı.
* **Güvenli Kimlik Doğrulama:** `SecurityFilterChain` ile yetkilendirme, `BCryptPasswordEncoder` ile hash'lenmiş şifre saklama ve özel filtre (`JwtAuthenticationFilter`) yapısı.
* **Gelişmiş Hata Yönetimi:** `AuthEntryPoint` ile kimlik doğrulama hatalarının (401 Unauthorized) standartlaştırılması.

### 📊 Mimari Akış
Sistem, mobil uygulamalar veya web arayüzleri ile entegre olabilecek şekilde şu akışla çalışmaktadır:



### 💡 Öğrenilen Kazanımlar
Bu proje ile birlikte;
1. Stateless (Session'sız) oturum yönetiminin mantığını kavradım.
2. Spring Security filtre zincirine müdahale ederek güvenliği özelleştirmeyi öğrendim.
3. Versiyon uyumsuzlukları gibi gerçek dünya yazılım problemlerini çözerek kütüphane bağımlılık yönetimi konusunda tecrübe kazandım.

---
*Bu proje, bir "marketplace" bitirme projemin backend altyapısının temelini oluşturmaktadır.*
