1. Thread Task:


2. Structural Task: 
Bir medya oynatıcınız var ve bu medya oynatıcı sadece MP3 dosyalarını çalabiliyor. 
Ancak, MP4 ve VLC formatındaki dosyaları da çalmak istiyorsunuz. 
Bu sorunu Adapter tasarım desenini kullanarak nasıl çözersiniz?


3. Creational Tasks:

3.1. Singleton:
Bir veritabanı bağlantı sınıfınız var ve bu sınıftan sadece bir tane örnek oluşturulmasını sağlamak istiyorsunuz. 
Bu durumu Singleton tasarım desenini kullanarak nasıl çözersiniz? 
Singleton sınıfının thread-safe (çoklu iş parçacığına güvenli) olmasını ve lazy initialization (tembel başlatma) kullanmasını sağlayın.

3.2. Factory
Bir araba üretim sistemi düşünün. Bu sistemde, farklı türlerde arabalar üretiliyor: Sedan, SUV ve Hatchback. Bu arabaları üretmek için bir fabrika sınıfı (Factory) oluşturun. Araba türüne göre doğru araba nesnesini döndüren bir CarFactory sınıfı tasarlayın.

3.3. Abstract Factory
Bir bilgisayar üretim sistemi düşünün. Bu sistemde, masaüstü bilgisayar (PC) ve sunucu (Server) üretiliyor. Bilgisayarlar için farklı konfigürasyonlar (CPU, RAM, HDD) kullanılıyor. Bir Computer arayüzü, PC ve Server sınıfları ve bu bilgisayarları üretmek için bir fabrika sınıfı (Factory) oluşturun. Ayrıca, bilgisayarların konfigürasyonlarını ayarlamak için bir Abstract Factory tasarlayın.


4. Behavioral Tasks:

4.1. State Pattern
Bir medya oynatıcınız var ve bu medya oynatıcı duruma göre farklı davranışlar sergiliyor. 
Oynatıcı üç durumda olabilir: 
Duraklatılmış (Paused), Oynatılıyor (Playing) ve Durdurulmuş (Stopped). 
Bu durumu State tasarım deseni kullanarak uygulayın. 
Her durumda oynatıcının nasıl davranacağını belirten bir uygulama yazın.

4.2. Command Pattern
Bir akıllı ev sistemi düşünün. 
Bu sistemde lambaları açma ve kapama işlemleri yapılabiliyor. 
Her işlem bir komut olarak tanımlanmalı ve bu komutlar bir komut dizisi olarak çalıştırılabilir olmalıdır. 
Bu durumu Command tasarım deseni kullanarak uygulayın. 
Bir lambayı açma ve kapama komutlarını oluşturup bu komutları bir invoker aracılığıyla çalıştıran bir uygulama yazın.
