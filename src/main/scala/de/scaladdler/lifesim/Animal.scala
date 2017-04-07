package de.scaladdler.lifesim

/*
Schaf:
- random movement
- dauerhaft gesättigt
- wächst zunehmend (Zyklen)
- ab bestimmten Zyklus (Alter) => Kind
- Ein (oder mehrere) Kinder (Gewicht variiert)
- Kinder bekommen mehrfach möglich pro Tier

Wolf:
- random movement bis Schaf in Fressnähe
- Sättigung abhängig von Schaf Gewicht
- wenn kein Hunger => kein Schaf wird gefressen
- Hunger tritt nach einer Weile ein
- Kinder bekommen wie beim Schaf
- wenn bestimmtes Gewicht erreicht, ist Vermehrung möglich
- wenn Hunger über bestimmten Wert, wächst der Wolf (Gewichtszunahme)
- Maximalalter und Maximalgewicht
- Speicher für Nahrungsreserve abhängig vom aktuellen Gewicht (Prozent)
- Wolf stirbt bei 0 Speicher, Kein Hunger ab bestimmter Speichergrenze (bspw.: >90%)

Vererb- und Mutierbare Eigenschaften
""""""""""""""""""""""""""""""""""""
- Maximalalter
- Maximalgewicht
- durchschnittliche Laufdistanz
------------------------------------
Wolf:
- Fitness => prozentuale Angabe, die gültige Gewichtsintervall fürs Fressen angibt)
- Sättigungsgrenze Gewichtszunahme
*/

trait Animal {

  def lifeStatus: LifeStatus
  def movementStatus: MovementStatus
  def coordinate(): Coordinate
  def orientateAndMove(): Animal
  def growAndAge(): Animal

}

case class Sheep(lifeStatus: LifeStatus, movementStatus: MovementStatus, coordinate: Coordinate) extends Animal {

  override def orientateAndMove(): Animal = {
    if(movementStatus == Inactive)
      this
    else {
      /*
      Inaktiv: Zähler runterzählen (Inaktivität ist auch irgendwann mal vorbei) :D
      Random:
        1) Distanz erreicht?
        2) ja: neue Richtung bzw. neuer Zielpunkt
        3) nein: Aktuelle Coordinate + Bewegung (Check auf Kartenränder) = neue Koordinate
       */
    }
  }

  override def growAndAge(): Animal = {

  }

}
