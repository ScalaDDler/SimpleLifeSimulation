package de.scaladdler.lifesim

sealed trait LifeStatus
case object Alive extends LifeStatus
case object Dead extends LifeStatus

sealed trait MovementStatus
case object Inactive extends MovementStatus
case object Random extends MovementStatus
trait Directed extends MovementStatus

sealed trait Wolf
case object Following extends Directed with Wolf
// case object Resting extends Directed with Wolf