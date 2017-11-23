package org.three.math

operator fun Vector3.unaryMinus() = this.clone().negate()
operator fun Vector3.plusAssign(v : Vector3) = this.let { add(v); Unit }
operator fun Vector3.plus(v : Vector3) = this.clone().add(v)
operator fun Vector3.minusAssign(v : Vector3) = this.let { sub(v); Unit }
operator fun Vector3.minus(v : Vector3) = this.clone().sub(v)
operator fun Vector3.times(v : Vector3) = this.clone().multiply(v)
operator fun Vector3.timesAssign(v : Vector3) = this.let { times(v); Unit }