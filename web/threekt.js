if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'threekt'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'threekt'.");
}
var threekt = function (_, Kotlin) {
  'use strict';
  var print = Kotlin.kotlin.io.print_s8jyv4$;
  var Vector3_init = THREE.Vector3;
  function main(args) {
    var hello = 'hello';
    print(hello);
    var v = new Vector3_init();
    print(v);
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('threekt', _);
  return _;
}(typeof threekt === 'undefined' ? {} : threekt, kotlin);
