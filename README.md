# HelloConstraint – Naloga 3

## Opis aplikacije
Aplikacija je izdelana v Android Studiu z uporabo Jave in ConstraintLayout.

Vsebuje tri gumbe:
- **Toast** – prikaže kratko sporočilo.
- **Count** – povečuje števec za 1. Pri lihih številih se obarva rdeče, pri sodih pa zeleno.
- **Zero** – ponastavi števec na 0. Ob kliku na Count postane moder, ob ponastavitvi pa spet siv.

Aplikacija vsebuje tudi postavitve za pokončni (`layout`), ležeči (`layout-land`) in večji zaslon (`layout-xlarge`).

## Odgovori na vprašanja

**1. Katera atributa omogočata navpično postavitev gumba Zero?**

`app:layout_constraintTop_toBottomOf` in `app:layout_constraintBottom_toTopOf`.

**2. Kateri atribut omogoča vodoravno poravnavo gumba Zero?**

`app:layout_constraintStart_toStartOf` (uporabljen je tudi `app:layout_constraintEnd_toEndOf`).

**3. Kako lahko dodamo gumb Zero v postavitvi xlarge in land?**

**c)** Oba postopka sta ustrezna. Gumb lahko dodamo v zavihku Design ali kopiramo njegovo XML-kodo.

**4. Kakšen je pravilen podpis metode za android:onClick?**

**b)** `public void callMethod(View view)`

**5. Kateri pristop je učinkovitejši za spreminjanje barve gumba Count?**

**b)** Uporaba parametra `view` in metode `setBackgroundColor()`, saj ni treba ponovno iskati gumba z `findViewById()`.
