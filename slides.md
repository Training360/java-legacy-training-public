class: inverse, center, middle

# Munka a legacy kóddal

---

## Legacy kód fogalma

* Nagyon sok
* Nehéz megérteni
* Nehéz módosítani
* Félelem a módosítástól
* Lassú feedback a módosításról

> A kód, amit mástól kaptam. - ismeretlen

> When I say "Legacy Code" I mean valuable code you're afraid to change. - [Understand Legacy Code](https://understandlegacycode.com/)

---

## Legacy kód értéke

* Értéket termel
* Miért kell hozzányúlni?
  * Funkcionális követelmények
  * Nem funkcionális követelmények
    * Hibatűrés
    * Performancia
    * Magas rendelkezésre állás
    * Üzemeltethetőség

---

## Szabályok be nem tartása

* Nem Clean Code
  * Ugye ismered és használod a jelenlegi projektben?
  * "A forráskód a többi programozónak írja le, hogy mit akarsz a géptől."
* Nem objektumorientált
  * Ugye ismered és használod a jelenlegi projektben? (high cohesion, low coupling, S.O.L.I.D., GoF design patterns)
* Architektúra problémák
  * Architektúra nélküliség (struktúra hiánya, spagetti kód)
  * Hibásan választott architektúra
  * Architektúrák, architektúrális minták nem annyira ismertek, mint a CC vagy OO
  * Architektúra dokumentáltság hiánya (C4, UML, ADL)
  * Ugye ismered és használod a jelenlegi projektben?

---

## Szabályok be nem tartása

* Rosszul választott eszközrendszer
  * Nem library-k - kezelhető
  * Futtatókörnyezet, keretrendszer - még itt is vannak megoldások (platformfüggetlenség, non invasive)
  * Programozási nyelv, paradigma (functional, reactive)

---

## Hozzáállás

* A legacy kód értéket termel
* A legacy kódnak vannak felhasználói
* Mások hibáztatása: ügyféligény, időszorítás, management, más fejlesztők
  * Ügyféligények változnak
  * Versenytársak szorítása
  * Jogszabályi környezet változása
  * Szoftvernek követnie kell a változó igényeket
  * Te biztos nem fejlesztettél sosem legacy kódot? (Csak a gyíkemberek...)
  * Amit most fejlesztesz, biztos nem lesz sosem legacy kód?

---

## Motiváció

* Megértés öröme
* Új funkció létrehozásának öröme
* Egyszerűsítés (törlés) öröme
* Melyik az időtállóbb? Egy keretrendszer vagy a legacy kód kezelésének képessége?
* Nagyobb irodalma van, mint gondolnád

---

## Big bang rewrite

* Brownfield project

> If you do a big bang rewrite, the only thing you are certain of is a big bang! - Rebuilding vs. Refactoring (2003) poszt by Martin Fowler (eltűnt)

* Problémák
  * Jó emberek az új projektre - feszültség
  * Alulbecslés (idő, költség)
  * Felhasználók nem bevonása - változó felület, változó, eltűnő funkcionalitás
  * Legacy rendszerben folyamatos változtatások, amit le kell követni az új rendszerben is
  * Overengineering - [Second-System Effect](https://en.wikipedia.org/wiki/Second-system_effect) - The Mythical Man-Month by Fred Brooks (1975)
    * Felesleges absztrakció, túlbiztosítás
  * Folyamatos nyomás az új rendszerek fejlesztőin, nagy elvándorlás
  
---

## Tényleg fejlődtünk annyit?

* Jobban megismertük az ügyféligényeket?
* Fejlesztési módszertanunk fejlődött?
* CC-ban jobbak vagyunk?
* OO-ban jobbak vagyunk?
* Architektúrában, modularizációban jobbak vagyunk?
* Megjelentek új módszertanok, eszközök. Ismerjük őket?

> Ha nem tudsz monolitot írni, microservice-t sem fogsz tudni. - ismeretlen

---

## Gyakorolni, gyakorolni, <br /> gyakorolni - Code Kata

* https://understandlegacycode.com/blog/5-coding-exercises-to-practice-refactoring-legacy-code/
* [ExpenseReport](https://github.com/christianhujer/expensereport/)
* https://kata-log.rocks/
* http://codekata.com/

---

## Legacy kód kezelésének <br /> módszertana

* Sok forrás arról, hogy tartsuk tisztán a kódot
* De mi van azzal, ami már nem tiszta?
* Jó/rossz hír: pont ugyanazokat kell figyelembe venni

---

## Legacy kód kezelésének <br /> irányelvei

* Cél a folyamat visszafordítása
* Apró lépésekben (külön commitok)
* Fáj, ezért minél gyakrabban 
* Szigetek, oázisok kialakítása
* Ne told túl!
* Code review
* "Programming is the art of doing one thing at a time."
  * Flow
* Ideális állapot nem érhető el
* Ne féljünk visszalépni (revert)
* Mesélj róla másoknak (gumikacsa effektus)

---

## Félelem a módosítástól

* Félelem, hogy a módosítással mit rontunk el
  * Apró az a módosítás ahhoz képest, amennyit funkcionálisan érintetlenül akarunk hagyni
  * Hogy bizonyosodhatunk meg arról, hogy nem módosul?
* CC, OO, stb. nem óv

---

## Kockázatkezelési megoldások

* Minél kevesebb módosítás, annál kevesebb kockázat
* Nő a struktúrálatlanság
* Ha ugyanezt kell tovább módosítani, nő a kockázat, hogy elrontunk valamit
* Edit and pray
  * Nagyon nagy szaktudás szükséges
  * "Operáció vajkéssel"

---


## Tesztek fontossága

* Tesztek adják meg a biztonságot

> To me, legacy code is simply code without tests. - Working Effectively with Legacy Code by Michael C. Feathers 

* Elvek alkalmazása a légtornász, a tesztesetek a védőháló
* Unit teszt
  * Gyors feedback
  * 0,1 másodperc nagyon lassúnak számít!
* Integrációs teszt
  * Lassú
  * Nem mondja meg azonnal, hogy hol a hiba

---

## Regressziós tesztelés

* Nem hibát akarunk találni
* Biztosítani akarjuk az állandóságot
* Csak a módosítás közvetlen környezetére koncentráljunk, kis scope
* Nem csak magunknak csináljuk
* Következő fejlesztőnek is előkészítjük a terepet, ha további módosítások szükségesek
  * Lehet, hogy mi leszünk
* Gyakrabban változó kódrészleteknél hamarabb megtérül

---

## Mi akadályozza a tesztelést?

* Függőségek
* **A függőségek kezelése az egyik legkritikusabb dolog a szoftverfejlesztésben**
* Legacy rendszerekben a legnagyobb munka ezek eliminálása
* Ideális világban: példányosítás - metódushívás - assert
* Való világban: függőségek

---

## Legacy code dilemma

* Ahhoz, hogy tesztelni tudjunk változtatni kell
* De hogyan változtassunk tesztek nélkül
* Megoldás: **konzervatív refactoring eljárások elvégzése**
  * Elemi lépés (commit)

---

## Függőségek feloldása

* Test double, fake, mock függőségek használata
* Seam: azok a pontok, ahol be tudunk avatkozni a működésbe a kód átírása nélkül
* Object seam, ezt objektum cseréjével tudjuk megtenni
* Enabling point, hogy melyik viselkedést válasszuk
* Refactoring: ilyen pontok létesítésére
  * Belső struktúra módosítása
  * Viselkedés módosítása nélkül

---

## Példa

```java
public class Mail {

    private String from;

    public Mail() {
        this.from = "info@"; // Logika a konstruktorban
    }

    public String getFrom() {
        return from;
    }
}
```

---

## Megoldás

.small-code-12[
```java
public class Mail {

    private String from;

    public Mail() {
        this.from = defaultValue();
    }

    // Refactoring: extract method
    // Object seam: be tudunk avatkozni a működésbe, override-olható metódus
    protected String defaultValue() {
        return "info@";
    }

    public String getFrom() {
        return from;
    }
}

class MailTest {

    @Test
    void testCreate() {
        // Enabling point: példányosításnál döntünk a változásról
        var mail = new Mail() {
            @Override
            public String getFrom() {
                return "test@";  // Fake object/test double
            }
        };
        assertEquals("test@", mail.getFrom());
    }
}
```
]

---

## Dependency-Breaking Techniques

* Legjobb gyakorlatok ezekre hivatkoznak
* Hányszor hallom: "Ez egy legacy kód, erre nem lehet unit tesztet írni, mert nem úgy lett megírva."
* Könyvben 24 függőség feloldási módszer
* Mindegyikre rengeteg használati eset, példakód

.small-code-12[
```java
public class UpdateEmployeeController {

  public String update() {
    employeesService.updateEmployee(command);

    // Globals
    FacesContext
      .getCurrentInstance()
      .addMessage(null, new FacesMessage("Employee has been updated"));
    FacesContext
    .getCurrentInstance()
    .getExternalContext()
    .getFlash().setKeepMessages(true);

    return "/index.xhtml?faces-redirect=true";
  }
}
```
]

---

## Encapsulate global reference

.small-code-12[
```java
public class FlashMessages {

  public void addMessage(String text) {
    FacesContext
      .getCurrentInstance()
      .addMessage(null, new FacesMessage(text));
    FacesContext
      .getCurrentInstance()
      .getExternalContext()
      .getFlash().setKeepMessages(true);
  }
}
```
]

.small-code-12[
```java
public class UpdateEmployeeController {

  private FlashMessages flashMessages;

  public UpdateEmployeeController(FlashMessages flashMessages) {
    this.flashMessages = flashMessages;
  }

  public String update() {
    employeesService.updateEmployee(command);
    flashMessages.addMessage("Employee has been updated");
    return "/index.xhtml?faces-redirect=true";
  }

}
```
]

---

## Dependency-Breaking - 1.

* Adapt parameter
  * Konstruktor, metódus paramétere egy kiváltandó függőség
  * Paraméter wrapper, paraméter burkolása másik osztályba, ami delegál
  * Az osztály mockolható lesz
* Break-out method object
  * Nem példányosítható osztályban lévő metódus
  * Új osztály létrehozása, konstruktorban átadjuk a paramétereket, majd paraméter nélküli metódus hívása
* Definition completion (Javaban nem releváns)
* Encapsulate global reference
  * Statikus metódussal használt globális függőség kiváltása
  * Statikus metódushívást elrejteni egy osztályba, és dependency injection

---

## Dependency-Breaking - 2.

* Expose static method
  * Attribútumra nem hivatkozó metódust nem tesztelhető, mert az osztály nem példányosítható
  * Legyen static
* Extract & override
  * Metódus közepén kiváltandó függőség
  * Metódusba kiszervezni, leszármazottban felülírni
* Extract & override factory method
  * Mint az előző, csak konstruktorban
* Extract & override getter (Javaban nem releváns)
* Extract implementer
  * Függőség kiváltása
  * Osztály átalakítása interfésszé, implementáció áthelyezése új, más nevű osztályba
  * Hasonló, mint az extract interface

---

## Dependency-Breaking - 3.

* Extract interface
  * Függőség kiváltása
  * Új interfész kiemelése, hivatkozások átírása az új interfészre
* Introduce instance delegator
  * Kiváltandó statikus metódusok
  * Példánymetódusok létrehozása, melyek delegálnak, és a példány dependency injectionnel átadandó
* Introduce static setter
  * Statikus metódus által visszaadott érték cseréje
  * Új statikus setter metódus, hogy mit adjon vissza az eredeti metódus
* Link substitution (Javaban nem releváns)

---

## Dependency-Breaking - 4.

* Parametrize constructor
  * Konstruktorban létrehozott példány cseréje
  * Példány konstruktor paraméterében legyen átadva
* Parametrize method
  * Metódusban létrehozott példány cseréjeú
  * Példány metódus paraméterében legyen átadva
* Primitivize Parameter
  * Metódus bonyolult paramétereken dolgozik
  * Paramétereket átkonvertálni más típusra, hogy csak a szükségesek kerüljenek átadásra

---

## Dependency-Breaking - 5.

* Pull Up Feature
  * Osztály tele függőségekkel, de a metódusok egy részének nem kell
  * Kiemelni egy ősosztályba új névvel, és az tesztelhető
* Push Down Dependency
  * Mint az előbbi, csak itt a leszármazott jön létre új névvel
* Replace Function with Function Pointer (Javaban nem releváns)
* Replace Global Reference with Getter
  * Statikus metódussal használt globális függőség kiváltása
  * Új metódus bevezetése a függőség kiváltására, és leszármazottban mock adható vissza
* Subclass and Override Method
  * Függőség egy metódusát le kell cserélni
  * Leszármazás és metódus felülírása

---

## Dependency-Breaking - 6.

* Supersede Instance Variable (Javaban nem releváns)
* Template Redefinition (Javaban nem releváns)
* Text Redefinition (Javaban nem releváns)

---

## Best practices - nincs elég idő

* Sproud method: új metódus létrehozása, ennek tesztelése
  * A hívó fél nincs tesztelve
  * Nagyon körültekintően kell eljárni
* Sproud class: új osztály létrehozása, ennek tesztelése
* Wrap method:
  * Eredeti metódus átnevezése
  * Új metódus hívja a régit, és az új, letesztelt metódust
* Wrap class:
  * Decorator tervezési minta

---

## Best practices - nagy mennyiségű függőség

* Pl. repo osztály, sok metódussal
* Dependency inversion - interfész bevezetése

---

## Best practices - új funkcionalitás bevezetése

* TDD: előnye, hogy egyszerre egy dologra kell koncentrálni
* Programming by difference
  * Leszármazás + override
    * Liskov elvet megtörheti
      * Biztosítása:
        * Csak abstract metódust lehet override-olni
        * Legyen benne super hívás
    * Egyszeres öröklődés miatt limitált
  * Composition
    * Delegálás

---

## Best practices - osztály nem példányosítható

* Nem példányosítható az osztály konstruktor paraméter miatt
  * Paramétert interfész mögé rejteni
  * null átadása tesztesetben legális
  * Null object pattern
  * Leszármazott átadása
* Rejtett függőség
  * Constructor dependency injection

---

## Best practices - osztály nem példányosítható

* Construction blob
  * Túl sokat csinál a konstruktor
  * Extract method
* Global dependency
  * Sokszor a singleton inkább egy globális változónak felel meg, hiszen mindenhonnan elérhető
  * Static setter/Encapsulate global reference/Replace Global Reference with Getter

---

## Best practices - elrejtett metódus

* Privát
  * Sose tegyük publikussá!
  * Sose hívjuk reflectionnel!
  * Publikus metóduson keresztül teszteljük
  * Ha direktben akarjuk, akkor valami nem stimmel a single responsibility-vel
  * Tegyük át másik osztályba

---

## Best practices - minek mire <br /> van kihatása

* Rajzoljuk meg a metódusok egymásra hatásait
* Ez alapján található meg, mire kell tesztet írni
* Figyelembe venni:
  * Visszatérési érték
  * Paraméter módosítás (immutable fontossága)
  * Globális érték módosítás
  * Leszármazottak
* Side effect
  * Command and query

---

## Best practices - tesztelés

* Ne frusztáljon, hogy a unit teszteket sokat kell módosítani, aprók, nem okoz gondot!
* Lehet, hogy csak messze tudjuk megfogni unit teszttel
* Haladjunk befelé
* Kintebb lévő teszt törölhető! - ez se frusztráljon!

---

## Furcsaságok a teszteléssel <br /> kapcsolatban

* Amikor feltárjuk az alkalmazást, újra és újra futtatjuk, próbálgatjuk különböző adatokkal, pedig írhatnánk tesztet
* Írunk main metódust, pedig írhatnánk tesztet
* Sokszor fejben interpretálunk, ahelyett, hogy tesztet írnánk

---

## Karakterizációs teszt

* Kipróbáljuk, hogy működik, amit visszaad, mehet assertbe
* Hasznosabb, mint elavult doksik olvasásgatása
* Dokumentálja az aktuális működést
* Sok inputtal meg lehet hajtani, data driven testing
* Lehet black box tesztelés
* Lehet white box, kódlefedettséggel
* Következő fejlesztőnek már nem kell futtatgatnia
* Általában happy path, megértés a cél
* Keressünk osztály invariánsokat!
  * Osztály állapotára vonatkozó örök igazságok
  * Írjunk rá tesztet!

---

## Best practices - libek

* Ne függjünk
  * 3rd party: interfészek mögé rejteni
  * framework: non-invasive
* Baj a globálisokkal, singletonokkal
* Language feature
  * Sealed és final classes
  * Növeli a biztonságot, de csökkenti a bővíthetőséget és tesztelhetőséget
  * Nagyon-nagyon megfontoltan használjuk  
  * Ha ilyennel találkozunk, pl. 3rd party-ban, wrappelni kell

---

## Best practices - architektúra

* Jó ha van architect, de mindig legyen ott
* Jobb, ha mindenki ismeri az architektúrát
* Pár mondatban el kell tudni mondani
  * Hagyjuk a kivételeket
* Üzleti fogalmak jelenjenek meg osztályban

---

## Best practices - nagy osztályok

* Single responsibility-t megtöri
* Egy mondatban összefoglalhatónak kell lennie a felelősség (and, or)
* Sok példányváltozó, nem tudjuk mi mire lesz hatással
* Egyszerre több fejlesztő piszkálja
* Nehezen tesztelhető
* Szétválasztás
  * Interfész szinten: Interface Segregation Principle
    * Nézzük meg mennyi kis különálló interfész kell    
  * Implementáció szinten:
    * Facade design pattern
* Kohézió
  * Ábra készíthető

---

## Best practices - duplikátumok

* Eltávolításának eredménye általában az Open/Closed principle betartása
  * Nyílt a kiterjesztésre, zárt a módosításra
  * Új funkció implementálásakor nem kell kódot módosítani, csak új kódot írni
* Nem feltétlenül érdemes minden duplikációt azonnal megszüntetni
  * A rossz absztrakció sokkal rosszabb, mint a duplikáció
  * Rule of three - várjuk meg a harmadik előfordulást

---

## Best practices - túl hosszú <br /> metódusok

* Típusai
  * Bulleted methods
  * Snarled methods
  * Very snarled methods
* Feltételek kezelése
  * Skeletonize: külön a feltételt, külön a törzset
  * Find sequence: egyben az egészet

---

## Mikado method

* [Use the Mikado Method to do safe changes in a complex codebase](https://understandlegacycode.com/blog/a-process-to-do-safe-changes-in-a-complex-codebase/)
* Goal: cél kitűzése
* Experiment: időkereten belül próbáljuk megoldani a problémát (10 p)
* Ha nem sikerült
  * Revert
  * Keressük meg, hogy miért nem sikerült
  * Vegyük fel új alcélnak, vizualizáljuk, folytassuk az új alcéllal
* Ha sikerült
  * Commit
  * Húzzuk ki a papíron
  * Keressünk új célt, és folytassuk azzal
* Baby steps, nincs napokon át nyúló 500 fájlos nyitott módosítás, melyet egy
  priorizált feladat miatt félbe kell hagyni

---

## Explanatory refactoring

* Megértést segíti
* Timebox
* Változók, metódusok átnevezése
* Elvethető

---

## Proximity refactoring

* Ami együtt változik, legyen egymáshoz közel
* [A tanulás tanulása: Hatékony mentális eszközök, melyek segítenek megbirkózni a nehéz tantárgyakkal (Learning How to Learn)](https://www.coursera.org/learn/a-tanulas-tanulasa)
* Egyszerre 7 dolgot képes a rövidtávú memória fejben tartani
* Chunking
* Kódban
  * Változódeklaráció közel a felhasználás helyéhez
  * Egymást hívó metódusok közel legyenek egymáshoz
  * Nagyon hosszú metódusok felbontása egy nagy vezérlő metódusra
  * Külön commit

---

## Eszközök - 1.

* IntelliJ IDEA
  * Analyze/Dependencies
  * Analyze/Backward Dependencies
  * Analyze/Cyclic dependencies
  * Analyze/Data flow to here
  * Analyze/Data flow from here
* JUnit
* JUnit data driven testing
* https://stackoverflow.com/questions/7913201/why-does-intellij-take-20-seconds-to-launch-a-unit-test
* Continuous testing - IntelliJ IDEA - Toggle Auto-Test
* IntelliJ IDEA Refactor

---

## Eszközök - 2.

* [PIT mutation testing system](https://pitest.org/)
* IntelliJ IDEA Run with Coverage
* Jacoco
* C4
* ADL
* Mockito
  * [Mocking static methods](https://javadoc.io/doc/org.mockito/mockito-core/latest/org/mockito/Mockito.html#48)
  * [Mocking object construction](https://javadoc.io/static/org.mockito/mockito-core/5.2.0/org/mockito/Mockito.html#49)
  * Mocking only one method
* Hexagonal (Ports and Adapters) architecture
* ArchUnit, Spring Modulith
* DDD, domain model, domain and value objects

---

## Eszközök - 3.

* SonarQube - Complexity
* Dependency Structure Matrix?
  * https://www.jetbrains.com/help/idea/dsm-analysis.html#run-dsm
* Kohéziót mérő eszköz?
* Legtöbbet módosított fájlokat kereső eszköz? (Hotspot)
* Együtt változó fájlokat kereső eszköz a verziókezelőben?
* Mely területek melyik fejlesztőhöz tartoznak? (Knowledge map)
  * [code-forensics](https://github.com/smontanari/code-forensics)
