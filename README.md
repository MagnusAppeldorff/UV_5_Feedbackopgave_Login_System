    Runtime Renegades:
-Ahmad 
-Ahman 
-Stefan
-Magnus

    Hvad gør programmet:

Brugeren bliver mødt af en velkomstskærm og bliver bedt om at indtaste et brugernavn.
Hvis brugernavnet findes i systemet, går programmet videre og beder om et password.
Hvis brugernavn og password stemmer over ens, logges brugeren ind med en succesmeddelelse, som også viser login tidspunkt og dato.

    Udvidelser:

Tidstempel: Viser klokken når brugeren starter og når brugeren er logget ind viser den både tid og dato

Feedback: Skriver til brugeren hvis adgangskoden er forkert.

Bedre UI: Skriver klart til brugeren hvor mange forsøg man har tilbage.

Password: Efter korrekt indtastet brugernavn og password, får brugeren sit password i * afhængigt af længden på det. Samt passwordet i en ()

    I hvilke metoder er programmet opdelt:

userLogin() Her håndteres selve brugerfladen, input fra brugeren, tælling af forsøg og udskrifter af meddelser til brugeren.

validateUser() Her tjekkes der om det indtastede brugernavn eksisterer i vores arrray.

validatePassword() Her tjekkes der om det indtastede password matcher det specifikke brugernavn.

    Hvorfor denne opdeling:

Denne opdeling er valgt så hver metode har et ansvarsområde, det gør koden nemmere at læse og rette fejl.
Så der i vores main kun står 1 linje.

    Hvilke løkker som bliver brugt:

Programmet bruger while-løkker samt for-løkker:

while-løkken bruges til selve loginforsøgene (while(loginAttempts > 0)). Dette er valgt, fordi vi ikke på forhånd ved, om brugeren taster rigtigt i 1., 2. eller 3. forsøg. 
Løkken skal køre så længe betingelsen er opfyldt, eller indtil den afbrydes af et succesfuldt login (return).

for-løkkerne bruges inde i valideringsmetoderne til at løbe igennem arrayene med brugernavne og passwords, fordi vi her kender den præcise længde på arrayet.

    Test af programmet:

Gyldigt login: Indtastning af korrekt brugernavn (user1) og korrekt password (pass1) logger brugeren ind med succes

Forkert brugernavn: Indtastning af et ukendt brugernavn får man beskeden "❌ Forkert brugernavn! Prøv igen." uden at trække fra de 3 password forsøg.

Spærring af konto: Indtastning af korrekt brugernavn giver 3 forsøg til at skrive rigtigt password, ellers bliver kontoen låst.

    Fejl og udfordringer:

I den afleveret opgave, har vi gjort så brugeren har ∞ forsøg til at skrive sit brugernavn og først efter et korrekt har brugeren 3 forsøg til at skrive deres password.
Vi har snakket om programmet skulle afslutte hver gang brugeren skrev forkert brugernavn?

Vi har lavet vores opgaver på forskellige måder. I den afleveret opgave har vi benyttet void main.
Men har snakket om hvordan public class Main og public static void main skal bruges og hvordan det virker.

    Hvad vi har lært:

Hvis man benytter sig af array så kan man ikke tilføje ekstra brugere. 
Der skal vi derimod benytte os af list.
