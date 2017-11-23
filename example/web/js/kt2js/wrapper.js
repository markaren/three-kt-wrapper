if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'wrapper'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'wrapper'.");
}
var wrapper = function (_, Kotlin) {
  'use strict';
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var WebGLRendererProxy = THREE.WebGLRenderer;
  WebGLRenderer.prototype = Object.create(WebGLRendererProxy.prototype);
  WebGLRenderer.prototype.constructor = WebGLRenderer;
  function ColorConstants() {
    ColorConstants_instance = this;
    this.aliceblue = 15792383;
    this.antiquewhite = 16444375;
    this.aqua = 65535;
    this.aquamarine = 8388564;
    this.azure = 15794175;
    this.beige = 16119260;
    this.bisque = 16770244;
    this.black = 0;
    this.blanchedalmond = 16772045;
    this.blue = 255;
    this.blueviolet = 9055202;
    this.brown = 10824234;
    this.burlywood = 14596231;
    this.cadetblue = 6266528;
    this.chartreuse = 8388352;
    this.chocolate = 13789470;
    this.coral = 16744272;
    this.cornflowerblue = 6591981;
    this.cornsilk = 16775388;
    this.crimson = 14423100;
    this.cyan = 65535;
    this.darkblue = 139;
    this.darkcyan = 35723;
    this.darkgoldenrod = 12092939;
    this.darkgray = 11119017;
    this.darkgreen = 25600;
    this.darkgrey = 11119017;
    this.darkkhaki = 12433259;
    this.darkmagenta = 9109643;
    this.darkolivegreen = 5597999;
    this.darkorange = 16747520;
    this.darkorchid = 10040012;
    this.darkred = 9109504;
    this.darksalmon = 15308410;
    this.darkseagreen = 9419919;
    this.darkslateblue = 4734347;
    this.darkslategray = 3100495;
    this.darkslategrey = 3100495;
    this.darkturquoise = 52945;
    this.darkviolet = 9699539;
    this.deeppink = 16716947;
    this.deepskyblue = 49151;
    this.dimgray = 6908265;
    this.dimgrey = 6908265;
    this.dodgerblue = 2003199;
    this.firebrick = 11674146;
    this.floralwhite = 16775920;
    this.forestgreen = 2263842;
    this.fuchsia = 16711935;
    this.gainsboro = 14474460;
    this.ghostwhite = 16316671;
    this.gold = 16766720;
    this.goldenrod = 14329120;
    this.gray = 8421504;
    this.green = 32768;
    this.greenyellow = 11403055;
    this.grey = 8421504;
    this.honeydew = 15794160;
    this.hotpink = 16738740;
    this.indianred = 13458524;
    this.indigo = 4915330;
    this.ivory = 16777200;
    this.khaki = 15787660;
    this.lavender = 15132410;
    this.lavenderblush = 16773365;
    this.lawngreen = 8190976;
    this.lemonchiffon = 16775885;
    this.lightblue = 11393254;
    this.lightcoral = 15761536;
    this.lightcyan = 14745599;
    this.lightgoldenrodyellow = 16448210;
    this.lightgray = 13882323;
    this.lightgreen = 9498256;
    this.lightgrey = 13882323;
    this.lightpink = 16758465;
    this.lightsalmon = 16752762;
    this.lightseagreen = 2142890;
    this.lightskyblue = 8900346;
    this.lightslategray = 7833753;
    this.lightslategrey = 7833753;
    this.lightsteelblue = 11584734;
    this.lightyellow = 16777184;
    this.lime = 65280;
    this.limegreen = 3329330;
    this.linen = 16445670;
    this.magenta = 16711935;
    this.maroon = 8388608;
    this.mediumaquamarine = 6737322;
    this.mediumblue = 205;
    this.mediumorchid = 12211667;
    this.mediumpurple = 9662683;
    this.mediumseagreen = 3978097;
    this.mediumslateblue = 8087790;
    this.mediumspringgreen = 64154;
    this.mediumturquoise = 4772300;
    this.mediumvioletred = 13047173;
    this.midnightblue = 1644912;
    this.mintcream = 16121850;
    this.mistyrose = 16770273;
    this.moccasin = 16770229;
    this.navajowhite = 16768685;
    this.navy = 128;
    this.oldlace = 16643558;
    this.olive = 8421376;
    this.olivedrab = 7048739;
    this.orange = 16753920;
    this.orangered = 16729344;
    this.orchid = 14315734;
    this.palegoldenrod = 15657130;
    this.palegreen = 10025880;
    this.paleturquoise = 11529966;
    this.palevioletred = 14381203;
    this.papayawhip = 16773077;
    this.peachpuff = 16767673;
    this.peru = 13468991;
    this.pink = 16761035;
    this.plum = 14524637;
    this.powderblue = 11591910;
    this.purple = 8388736;
    this.rebeccapurple = 6697881;
    this.red = 16711680;
    this.rosybrown = 12357519;
    this.royalblue = 4286945;
    this.saddlebrown = 9127187;
    this.salmon = 16416882;
    this.sandybrown = 16032864;
    this.seagreen = 3050327;
    this.seashell = 16774638;
    this.sienna = 10506797;
    this.silver = 12632256;
    this.skyblue = 8900331;
    this.slateblue = 6970061;
    this.slategray = 7372944;
    this.slategrey = 7372944;
    this.snow = 16775930;
    this.springgreen = 65407;
    this.steelblue = 4620980;
    this.tan = 13808780;
    this.teal = 32896;
    this.thistle = 14204888;
    this.tomato = 16737095;
    this.turquoise = 4251856;
    this.violet = 15631086;
    this.wheat = 16113331;
    this.white = 16777215;
    this.whitesmoke = 16119285;
    this.yellow = 16776960;
    this.yellowgreen = 10145074;
  }
  ColorConstants.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'ColorConstants',
    interfaces: []
  };
  var ColorConstants_instance = null;
  function ColorConstants_getInstance() {
    if (ColorConstants_instance === null) {
      new ColorConstants();
    }
    return ColorConstants_instance;
  }
  function unaryMinus($receiver) {
    return $receiver.clone().negate();
  }
  function plusAssign($receiver, v) {
    $receiver.add(v);
  }
  function plus($receiver, v) {
    return $receiver.clone().add(v);
  }
  function minusAssign($receiver, v) {
    $receiver.sub(v);
  }
  function minus($receiver, v) {
    return $receiver.clone().sub(v);
  }
  function times($receiver, v) {
    return $receiver.clone().multiply(v);
  }
  function timesAssign($receiver, v) {
    times($receiver, v);
  }
  function WebGLRendererParams(canvas, alpha, depth, stencil, antialias, premultipliedAlpha, preserveDrawingBuffer) {
    if (canvas === void 0)
      canvas = null;
    if (alpha === void 0)
      alpha = null;
    if (depth === void 0)
      depth = null;
    if (stencil === void 0)
      stencil = null;
    if (antialias === void 0)
      antialias = null;
    if (premultipliedAlpha === void 0)
      premultipliedAlpha = null;
    if (preserveDrawingBuffer === void 0)
      preserveDrawingBuffer = null;
    this.params = new Object();
    this.params.canvas = canvas != null ? canvas : undefined;
    this.params.alpha = alpha != null ? alpha : undefined;
    this.params.depth = depth != null ? depth : undefined;
    this.params.stencil = stencil != null ? stencil : undefined;
    this.params.antialias = antialias != null ? antialias : undefined;
    this.params.premultipliedAlpha = premultipliedAlpha != null ? premultipliedAlpha : undefined;
    this.params.preserveDrawingBuffer = preserveDrawingBuffer != null ? preserveDrawingBuffer : undefined;
  }
  WebGLRendererParams.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'WebGLRendererParams',
    interfaces: []
  };
  function WebGLRenderer() {
  }
  WebGLRenderer.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'WebGLRenderer',
    interfaces: []
  };
  function WebGLRenderer_init($this) {
    $this = $this || Object.create(WebGLRenderer.prototype);
    WebGLRendererProxy.call($this);
    WebGLRenderer.call($this);
    return $this;
  }
  function WebGLRenderer_init_0(params, $this) {
    $this = $this || Object.create(WebGLRenderer.prototype);
    WebGLRendererProxy.call($this, params.params);
    WebGLRenderer.call($this);
    return $this;
  }
  var package$org = _.org || (_.org = {});
  var package$three = package$org.three || (package$org.three = {});
  var package$math = package$three.math || (package$three.math = {});
  Object.defineProperty(package$math, 'ColorConstants', {
    get: ColorConstants_getInstance
  });
  package$math.unaryMinus_2o4yq3$ = unaryMinus;
  package$math.plusAssign_e2kqkx$ = plusAssign;
  package$math.plus_e2kqkx$ = plus;
  package$math.minusAssign_e2kqkx$ = minusAssign;
  package$math.minus_e2kqkx$ = minus;
  package$math.times_e2kqkx$ = times;
  package$math.timesAssign_e2kqkx$ = timesAssign;
  var package$renderers = package$three.renderers || (package$three.renderers = {});
  package$renderers.WebGLRendererParams = WebGLRendererParams;
  package$renderers.WebGLRenderer_init = WebGLRenderer_init;
  package$renderers.WebGLRenderer_init_uih7je$ = WebGLRenderer_init_0;
  package$renderers.WebGLRenderer = WebGLRenderer;
  Kotlin.defineModule('wrapper', _);
  return _;
}(typeof wrapper === 'undefined' ? {} : wrapper, kotlin);
