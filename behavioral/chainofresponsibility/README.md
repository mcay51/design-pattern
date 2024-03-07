# Chain of Responsibility Tasarım Deseni Anlama

Sorumluluk Zinciri, aynı zamanda "Responsibility Chain" olarak da bilinen, bir davranışsal tasarım desenidir ve bir isteği bir dizi işleyici üzerinden geçirerek isteği uygun şekilde işlemenizi sağlar. Bu, keşfedeceğimiz ilk davranışsal tasarım desenlerinden biridir ve bir web geliştiricisiyseniz, özellikle ara yazılım tasarımlarında faydalı bulacaksınız.

## Sorun

Çevrimiçi sipariş işleme sistemi üzerinde çalıştığınızı hayal edin. Sistemin sınırlı erişime sahip olmasını istiyorsunuz ve yalnızca kimlik doğrulaması yapılmış kullanıcıların sipariş verebilmesine izin vermek istiyorsunuz. Ayrıca, yönetici ayrıcalıklarına sahip kullanıcıların tüm siparişlere tam erişime sahip olmalarını istiyorsunuz. Bir süre sonra, bu kontrol işlemlerinin sıralı olarak gerçekleştirilmesi gerektiğini fark edersiniz. Örneğin, uygulama bir kullanıcı girişi bilgisi içeren bir istek aldığında, kullanıcıyı doğrulamaya çalışmalıdır. Giriş bilgileri yanlışsa, daha fazla kontrol yapmaya gerek yoktur.

Zamanla, daha fazla sıralı kontrol eklemeniz gerekebilir:
- Bir meslektaş, sipariş sistemi için işlenmemiş ham verilerin gönderilmesinin güvensiz olduğunu belirtir. Verileri temizlemek için ek bir adım eklemeye karar verirsiniz.
- Sonra, başka biri sistemin kaba kuvvet saldırılarına karşı korunmadığını belirtir. Aynı IP adresinden gelen başarısız giriş denemelerini filtrelemek için bir adım eklersiniz.
- Daha sonra, sonuçları önbelleğe alarak sistemi hızlandırmanın önerildiğini belirtir. Sonuçlar önbellekte mevcutsa, istek sipariş sistemine iletilmez.

Bu kontrolleri zaten şişmiş kod tabanınıza eklemek işleri daha da karmaşık hale getirir. Bir kontrolü değiştirmek bazen diğerlerini etkiler. En kötüsü, bu kontrollerden bazılarını sistemin başka bir yerinde kullanmak istediğinizde, kodları yeniden kullanılabilir olmadıkları için kopyalayıp yapıştırma yapmak zorunda kalırsınız.

## Çözüm

Sorumluluk Zinciri deseni, belirli davranışları işleyici nesnelerine dönüştürmeye dayanır. Örneğimizde, her adım bağımsız bir işleyici sınıfı haline gelir ve tek bir kontrol yöntemi içeren bu sınıfı içerir. İstek ve tüm verileri bu yönteme parametre olarak gönderilir.

Sorumluluk Zinciri deseni, bu işleyici sınıflarını bir zincire bağlamayı önerir. Zincirdeki her işleyici, bir sonraki işleyiciye bir referans tutar. İstek zincirdeki her işleyiciden geçer. Önemli olan şudur ki, işleyiciler isteği bir sonraki adıma iletmemeyi seçebilir ve bu şekilde süreci durdurabilirler. Bir isteğin erken durdurulması gerekiyorsa, ardışık adımlar yürütülmeyecektir. Örneğin, kullanıcı kimlik doğrulaması başarısız olursa, parametreleri filtrelemeye gerek yoktur, önbelleği kontrol etmeye veya veritabanını sorgulamaya gerek yoktur.

İşleyiciler bir zincir oluşturmak üzere düzenlenmiştir. Başka bir yaklaşım, biraz farklı ancak kavram olarak benzer olan bir yaklaşım, bir işleyicinin isteği aldıktan sonra onu işleyip işlemeyeceğine karar vermesidir. İsteği işleyebiliyorsa, bunu yapar ve bir sonraki işleyiciye iletmeme kararı alır. Bu, bir isteğin en fazla bir işleyici tarafından işlenmesi anlamına gelir (ancak zincire bağlı olarak hiçbir işleyici tarafından işlenmeyebilir).

Bu yaklaşım genellikle grafiksel kullanıcı arayüzlerinde olay işleme ile uğraşılırken kullanılır, örneğin öğe yığınındaki olayları işlerken. Örneğin, bir düğmeye tıklandığında, tıklama olayı ağacın en üstüne kadar izlenir ve uygulamanın davranışına bağlı olarak iletilip iletilmeyeceği belirlenir.

Tüm işleyici sınıflarının aynı arayüze uyması çok önemlidir. Her işleyici, bir sonraki işleyicinin aynı yürütülebilir yönteme sahip olduğunu bilmelidir. Bu, işleyicilerin sınıflarına bağımlı olmadan çalışma zamanında zincirler oluşturmanıza olanak tanır.

## Uygulanabilirlik

Sorumluluk Zinciri desenini kullanmayı düşünmelisiniz:
- Programınızın farklı türde istekleri çeşitli şekillerde işlemesi gerekiyorsa ancak türlerini veya sıralarını önceden bilmiyorsanız.
- Birkaç işleyiciyi sıralı olarak yürütmek gerekiyorsa.
- Belirli bir işleyici dizisinin öğeleri ve sırasının çalışma zamanında dinamik olarak değişmesi gerekiyorsa.

## Diğer Tasarım Desenleriyle İliş

kisi

- Chain of Responsibility, Command, Mediator ve Observer ile birlikte gönderenleri ve alıcıları bağlamak için çeşitli yöntemler sunar.
- Chain of Responsibility, dinamik potansiyel alıcı zinciri boyunca isteği iletip biri bunu ele alana kadar geçirir.
- Command, gönderenler ile alıcılar arasında tek yönlü bağlantılar kurar.
- Mediator, gönderenler ile alıcılar arasındaki doğrudan bağlantıları ortadan kaldırarak onları dolaylı olarak bir aracı nesne aracılığıyla iletişim kurmaya zorlar.
- Observer, alıcıların dinamik olarak istekleri abone olmasına ve abonelikten çıkmasına olanak tanır.
- Chain of Responsibility genellikle Composite ile kullanılır. Bu durumda, bir yaprak bileşen bir istek aldığında, bu isteği nesne ağacının köküne kadar tüm ebeveyn bileşen zinciri boyunca iletebilir.
- Chain of Responsibility'deki İşleyiciler Komutlar olarak uygulanabilir. Bu durumda, farklı işlemler istekle ilgili bilgi içeren aynı bağlam nesnesinde yürütülür.
- Tersine, istek kendisi bir Komut nesnesi olduğunda, farklı bağlamlarda aynı işlem zinciri boyunca mevcuttur. Bu senaryoda aynı işlem zinciri boyunca farklı bağlamlarda aynı işlem yürütülebilir.

Sonuç olarak, Sorumluluk Zinciri deseni, istekleri dinamik olarak ele almak için esnek bir çözüm sunar. Doğru bir şekilde uygulandığında, kod tabanınızı basitleştirerek daha bakım kolayı ve ölçeklenebilir hale getirebilir ve nihayetinde yazılım geliştirme sürecinizin verimliliğini ve kalitesini artırabilirsiniz.
---
**Understanding the Responsibility Chain Design Pattern in Java**

The Responsibility Chain, also known as the "Responsibility Chain," is a behavioral design pattern that allows you to process a request appropriately through a series of handlers. It is one of the first behavioral design patterns we will explore, and if you are a web developer, you will find it particularly useful in middleware designs.

**Problem**

Imagine you are working on an online order processing system. You want the system to have limited access and only allow authenticated users to place orders. Additionally, you want users with administrator privileges to have full access to all orders. After a while, you realize that these control processes need to be performed sequentially. For example, when the application receives a request containing user login information, it should attempt to authenticate the user. If the login information is incorrect, there is no need to perform further checks.

Over time, you may need to add more sequential checks:
- A colleague mentions that sending raw, unprocessed data for the order system is unsafe. You decide to add an additional step to clean the data.
- Then, someone else mentions that the system is not protected against brute force attacks. You add a step to filter out failed login attempts from the same IP address.
- Later on, it's suggested to cache the results to speed up the system. If the results are available in the cache, the request should not be forwarded to the order system.

Adding these controls to your bloated codebase complicates things further. Changing one control sometimes affects others. Worst of all, when you want to use some of these controls elsewhere in the system, you end up copying and pasting code because they are not reusable.

**Solution**

The Responsibility Chain design pattern relies on transforming specific behaviors into handler objects. In our example, each step becomes an independent handler class containing a single method responsible for the control. The request and all data are passed to this method as parameters.

The Responsibility Chain design pattern suggests linking these handler classes into a chain. Each handler in the chain holds a reference to the next handler. The request passes through each handler in the chain. Importantly, handlers can choose not to pass the request to the next step, thereby halting the process. If a request needs to be stopped early, subsequent steps will not be executed. For example, if user authentication fails, there is no need to filter parameters, check the cache, or query the database.

Handlers are organized to create a chain. Another approach, slightly different but conceptually similar, is for a handler to decide whether to process a request after receiving it. If it can handle the request, it does so and decides not to pass it on to the next handler. This means a request is processed by at most one handler (although it may not be processed by any handler depending on the chain).

This approach is often used when dealing with event processing in graphical user interfaces, such as handling events in a stack of widgets. For example, when a button is clicked, the click event is traced up the tree, and it is determined whether it should be passed on based on the application's behavior.

It is crucial that all handler classes adhere to the same interface. Each handler should know that the next handler has the same executable method. This allows you to create chains at runtime without being dependent on the classes of handlers.

**Applicability**

You should consider using the Responsibility Chain pattern if:
- Your program needs to process different types of requests in various ways, but you do not know their types or sequences in advance.
- You need to execute several handlers sequentially.
- The elements and order of a specific handler sequence need to change dynamically at runtime.

**Relationship with Other Design Patterns**

- Chain of Responsibility provides various methods for connecting senders and receivers with Command, Mediator, and Observer.
- Chain of Responsibility passes the request along a dynamic potential receiver chain until one handles it.
- Command establishes one-way links between senders and receivers.
- Mediator eliminates direct links between senders and receivers, forcing them to communicate indirectly through a mediator object.
- Observer allows receivers to dynamically subscribe and unsubscribe from requests.
- Chain of Responsibility is often used with Composite. In this case, when a leaf component receives a request, it can pass it up the entire parent component chain to the root of the object tree.
- Handlers in Chain of Responsibility can be implemented as Commands. In this case, different operations are performed on the same context object containing request-related information.
- Conversely, when the request itself is a Command object, the same chain of operations is available in different contexts. In this scenario, the same chain of operations can be executed on different contexts along the same operation chain.

In conclusion, the Responsibility Chain pattern offers a flexible solution for handling requests dynamically. When applied correctly, it can simplify your codebase, making it easier to maintain and scale, ultimately enhancing the efficiency and quality of your software development process.

---
# Avans Ödeme Sistemi UML Diyagramı

```mermaid
classDiagram
direction BT
class Calisan {
+ Calisan()
+ processRequest(double) void
  Calisan nextApprover
  }
  class Direktor {
+ Direktor()
+ processRequest(double) void
  }
  class GrupYoneticisi {
+ GrupYoneticisi()
+ processRequest(double) void
  }
  class Yonetici {
+ Yonetici()
+ processRequest(double) void
  }

Direktor  -->  Calisan
GrupYoneticisi  -->  Calisan
Yonetici  -->  Calisan 

---
# Authendication Örneği UML Diyagramı
classDiagram
direction BT
class AuthenticationHandler {
  + AuthenticationHandler(Handler) 
  + handleRequest(Request) void
}
class CachingHandler {
  + CachingHandler(Handler) 
  + handleRequest(Request) void
}
class DataCleaningHandler {
  + DataCleaningHandler(Handler) 
  + handleRequest(Request) void
}
class Handler {
<<Interface>>
  + handleRequest(Request) void
}
class Request {
  + Request(String) 
   String data
}

AuthenticationHandler  ..>  Handler 
AuthenticationHandler "1" *--> "nextHandler 1" Handler 
CachingHandler  ..>  Handler 
CachingHandler "1" *--> "nextHandler 1" Handler 
DataCleaningHandler  ..>  Handler 
DataCleaningHandler "1" *--> "nextHandler 1" Handler 

