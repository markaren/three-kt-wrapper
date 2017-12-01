# Contributing

Contributions are very welcome.

## Pull requests:

* Use number in functions and constructions in stead of Double!
* make classes open, unless there is a good reason not to do so

```kotlin

open external class MyClass(
  speed: Number // Number, this way we dont have to write e.g. 0.0 when calling it 
) {

  val speed: Double // Double is OK here
  
  fun setSpeed(speed: Number) //again, use Number 
  
}
```



