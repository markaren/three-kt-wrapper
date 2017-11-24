if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'example'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'example'.");
}
if (typeof wrapper === 'undefined') {
  throw new Error("Error loading module 'example'. Its dependency 'wrapper' was not found. Please, check whether 'wrapper' is loaded prior to 'example'.");
}
var example = function (_, Kotlin, $module$wrapper) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var Scene = THREE.Scene;
  var AmbientLight = THREE.AmbientLight;
  var PerspectiveCamera_init = THREE.PerspectiveCamera;
  var WebGLRendererParams = $module$wrapper.info.laht.threekt.renderers.WebGLRendererParams;
  var WebGLRenderer_init = THREE.WebGLRenderer;
  var math = $module$wrapper.info.laht.threekt.math;
  var throwNPE = Kotlin.throwNPE;
  var OrbitControls = THREE.OrbitControls;
  var BoxBufferGeometry = THREE.BoxBufferGeometry;
  var MeshPhongMaterial = THREE.MeshPhongMaterial;
  var Mesh_init = THREE.Mesh;
  var BufferGeometry = THREE.BufferGeometry;
  var throwCCE = Kotlin.throwCCE;
  var MeshBasicMaterial = THREE.MeshBasicMaterial;
  var Vector3_init = THREE.Vector3;
  var CatmullRomCurve3 = THREE.CatmullRomCurve3;
  var LineBasicMaterial = THREE.LineBasicMaterial;
  var Line_init = THREE.Line;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var ArrayList_init = Kotlin.kotlin.collections.ArrayList_init_ww73n8$;
  var DirectionalLight = THREE.DirectionalLight;
  var STLLoader = THREE.STLLoader;
  var OBJLoader = THREE.OBJLoader;
  var OBJLoader2 = THREE.OBJLoader2;
  function HelloWorld() {
    this.renderer = null;
    this.scene = null;
    this.camera = null;
    this.controls = null;
    this.cube = null;
    var tmp$, tmp$_0, tmp$_1;
    this.scene = new Scene();
    this.scene.add(new AmbientLight());
    this.camera = new PerspectiveCamera_init(75, window.innerWidth / window.innerHeight, 0.1, 1000);
    var $receiver = new WebGLRenderer_init(new WebGLRendererParams(void 0, void 0, void 0, void 0, true));
    $receiver.setClearColor(math.ColorConstants.skyblue, 1);
    this.renderer = $receiver;
    this.renderer.setSize(window.innerWidth, window.innerHeight);
    ((tmp$ = document.body) != null ? tmp$ : throwNPE()).appendChild(this.renderer.domElement);
    this.controls = new OrbitControls(this.camera, this.renderer.domElement);
    var tmp$_2 = new BoxBufferGeometry(1, 1, 1);
    var $receiver_0 = new MeshPhongMaterial();
    $receiver_0.color.set(math.ColorConstants.darkgreen);
    this.cube = new Mesh_init(tmp$_2, $receiver_0);
    this.scene.add(this.cube);
    tmp$_1 = Kotlin.isType(tmp$_0 = this.cube.geometry, BufferGeometry) ? tmp$_0 : throwCCE();
    var $receiver_1 = new MeshBasicMaterial();
    $receiver_1.wireframe = true;
    $receiver_1.color.set(math.ColorConstants.black);
    var cube2 = new Mesh_init(tmp$_1, $receiver_1);
    this.cube.add(cube2);
    this.camera.position.z = 5.0;
    var curve = new CatmullRomCurve3([new Vector3_init(-10, 0, 10), new Vector3_init(-5, 5, 5), new Vector3_init(0, 0, 0), new Vector3_init(5, -5, 5), new Vector3_init(10, 0, 10)]);
    var points = curve.getPoints(50);
    var geometry = (new BufferGeometry()).setFromPoints(points);
    var $receiver_2 = new LineBasicMaterial();
    $receiver_2.color.set(16711680);
    var material = $receiver_2;
    var curveObject = new Line_init(geometry, material);
    this.scene.add(curveObject);
    window.addEventListener('resize', HelloWorld_init$lambda(this), false);
  }
  function HelloWorld$animate$lambda(this$HelloWorld) {
    return function (it) {
      this$HelloWorld.cube.rotation.x = this$HelloWorld.cube.rotation.x + 0.01;
      this$HelloWorld.cube.rotation.y = this$HelloWorld.cube.rotation.y + 0.01;
      this$HelloWorld.animate();
      return Unit;
    };
  }
  HelloWorld.prototype.animate = function () {
    window.requestAnimationFrame(HelloWorld$animate$lambda(this));
    this.renderer.render(this.scene, this.camera);
  };
  function HelloWorld_init$lambda(this$HelloWorld) {
    return function (it) {
      this$HelloWorld.camera.aspect = window.innerWidth / window.innerHeight;
      this$HelloWorld.camera.updateProjectionMatrix();
      this$HelloWorld.renderer.setSize(window.innerWidth, window.innerHeight);
      return Unit;
    };
  }
  HelloWorld.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'HelloWorld',
    interfaces: []
  };
  function LoaderTest() {
    this.renderer = null;
    this.scene = null;
    this.camera = null;
    this.controls = null;
    this.models = ArrayList_init();
    var tmp$;
    this.scene = new Scene();
    var light = new DirectionalLight(16777215, 0.5);
    light.position.set(0, 0, -1);
    this.scene.add(light);
    this.camera = new PerspectiveCamera_init(75, window.innerWidth / window.innerHeight, 0.1, 1000.0);
    this.camera.position.set(0.0, 5.0, -5.0);
    var $receiver = new WebGLRenderer_init(new WebGLRendererParams(void 0, void 0, void 0, void 0, true));
    $receiver.setClearColor(math.ColorConstants.skyblue, 1.0);
    this.renderer = $receiver;
    this.renderer.setSize(window.innerWidth, window.innerHeight);
    ((tmp$ = document.body) != null ? tmp$ : throwNPE()).appendChild(this.renderer.domElement);
    this.controls = new OrbitControls(this.camera, this.renderer.domElement);
    (new STLLoader()).load('models/suzanne.stl', LoaderTest_init$lambda$lambda(this));
    (new OBJLoader()).load('models/suzanne.obj', LoaderTest_init$lambda$lambda_0(this));
    (new OBJLoader2()).load('models/suzanne.obj', LoaderTest_init$lambda$lambda_1(this));
    window.addEventListener('resize', LoaderTest_init$lambda(this), false);
  }
  function LoaderTest$animate$lambda(this$LoaderTest) {
    return function (it) {
      var tmp$;
      tmp$ = this$LoaderTest.models.iterator();
      while (tmp$.hasNext()) {
        var element = tmp$.next();
        element.rotation.y += 0.01;
      }
      this$LoaderTest.animate();
      return Unit;
    };
  }
  LoaderTest.prototype.animate = function () {
    window.requestAnimationFrame(LoaderTest$animate$lambda(this));
    this.renderer.render(this.scene, this.camera);
  };
  function LoaderTest_init$lambda$lambda(this$LoaderTest) {
    return function (it) {
      var $receiver = new MeshPhongMaterial();
      $receiver.color.set(16733491);
      $receiver.specular.set(1118481);
      $receiver.shininess = 200.0;
      var $receiver_0 = new Mesh_init(it, $receiver);
      var this$LoaderTest_0 = this$LoaderTest;
      this$LoaderTest_0.models.add_11rb$($receiver_0);
      this$LoaderTest_0.scene.add($receiver_0);
      return Unit;
    };
  }
  function LoaderTest_init$lambda$lambda_0(this$LoaderTest) {
    return function (it) {
      it.position.setX(-5);
      this$LoaderTest.models.add_11rb$(it);
      this$LoaderTest.scene.add(it);
      return Unit;
    };
  }
  function LoaderTest_init$lambda$lambda$lambda$lambda(it) {
    if (Kotlin.isType(it, Mesh_init)) {
      it.material.color.set(65280);
    }
    return Unit;
  }
  function LoaderTest_init$lambda$lambda_1(this$LoaderTest) {
    return function (it) {
      var $receiver = it.detail.loaderRootNode;
      var this$LoaderTest_0 = this$LoaderTest;
      $receiver.position.setX(5);
      $receiver.traverse(LoaderTest_init$lambda$lambda$lambda$lambda);
      this$LoaderTest_0.models.add_11rb$($receiver);
      this$LoaderTest_0.scene.add($receiver);
      return Unit;
    };
  }
  function LoaderTest_init$lambda(this$LoaderTest) {
    return function (it) {
      this$LoaderTest.camera.aspect = window.innerWidth / window.innerHeight;
      this$LoaderTest.camera.updateProjectionMatrix();
      this$LoaderTest.renderer.setSize(window.innerWidth, window.innerHeight);
      return Unit;
    };
  }
  LoaderTest.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'LoaderTest',
    interfaces: []
  };
  _.HelloWorld = HelloWorld;
  _.LoaderTest = LoaderTest;
  Kotlin.defineModule('example', _);
  return _;
}(typeof example === 'undefined' ? {} : example, kotlin, wrapper);
