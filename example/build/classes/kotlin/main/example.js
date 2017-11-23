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
  var WebGLRendererParams = $module$wrapper.org.three.renderers.WebGLRendererParams;
  var WebGLRenderer_init = $module$wrapper.org.three.renderers.WebGLRenderer_init_uih7je$;
  var math = $module$wrapper.org.three.math;
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
  function main(args) {
    (new HelloWorld()).animate();
  }
  function HelloWorld() {
    this.renderer = null;
    this.scene = null;
    this.camera = null;
    this.controls = null;
    this.cube = null;
    var tmp$, tmp$_0, tmp$_1;
    this.scene = new Scene();
    this.scene.add(new AmbientLight());
    this.camera = new PerspectiveCamera_init(75, window.innerWidth / window.innerHeight, 0.1, 1000.0);
    var $receiver = WebGLRenderer_init(new WebGLRendererParams(void 0, void 0, void 0, void 0, true));
    $receiver.setClearColor(math.ColorConstants.skyblue, 1.0);
    this.renderer = $receiver;
    this.renderer.setSize(window.innerWidth, window.innerHeight);
    ((tmp$ = document.body) != null ? tmp$ : throwNPE()).appendChild(this.renderer.domElement);
    this.controls = new OrbitControls(this.camera, this.renderer.domElement);
    var tmp$_2 = new BoxBufferGeometry(1.0, 1.0, 1.0);
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
    var curve = new CatmullRomCurve3([new Vector3_init(-10.0, 0.0, 10.0), new Vector3_init(-5.0, 5.0, 5.0), new Vector3_init(0.0, 0.0, 0.0), new Vector3_init(5.0, -5.0, 5.0), new Vector3_init(10.0, 0.0, 10.0)]);
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
  _.main_kand9s$ = main;
  _.HelloWorld = HelloWorld;
  main([]);
  Kotlin.defineModule('example', _);
  return _;
}(typeof example === 'undefined' ? {} : example, kotlin, wrapper);
