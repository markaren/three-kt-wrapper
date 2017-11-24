if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'wrapper'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'wrapper'.");
}
var wrapper = function (_, Kotlin) {
  'use strict';
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Kind_CLASS = Kotlin.Kind.CLASS;
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
  function WebGLRenderTargetOptions(wrapS, wrapT, magFilter, minFilter, format, type, anisotropy, encoding, depthBuffer, stencilBuffer) {
    if (wrapS === void 0)
      wrapS = undefined;
    if (wrapT === void 0)
      wrapT = undefined;
    if (magFilter === void 0)
      magFilter = undefined;
    if (minFilter === void 0)
      minFilter = undefined;
    if (format === void 0)
      format = undefined;
    if (type === void 0)
      type = undefined;
    if (anisotropy === void 0)
      anisotropy = undefined;
    if (encoding === void 0)
      encoding = undefined;
    if (depthBuffer === void 0)
      depthBuffer = undefined;
    if (stencilBuffer === void 0)
      stencilBuffer = undefined;
    this.wrapS_dv1gen$_0 = wrapS;
    this.wrapT_dv1gfi$_0 = wrapT;
    this.magFilter_bhig9f$_0 = magFilter;
    this.minFilter_m62qtq$_0 = minFilter;
    this.format_y1ntcr$_0 = format;
    this.type_r39ola$_0 = type;
    this.anisotropy_8t31yy$_0 = anisotropy;
    this.encoding_lvmwcp$_0 = encoding;
    this.depthBuffer_dwq3yj$_0 = depthBuffer;
    this.stencilBuffer_2ho3j0$_0 = stencilBuffer;
  }
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'wrapS', {
    get: function () {
      return this.wrapS_dv1gen$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'wrapT', {
    get: function () {
      return this.wrapT_dv1gfi$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'magFilter', {
    get: function () {
      return this.magFilter_bhig9f$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'minFilter', {
    get: function () {
      return this.minFilter_m62qtq$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'format', {
    get: function () {
      return this.format_y1ntcr$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'type', {
    get: function () {
      return this.type_r39ola$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'anisotropy', {
    get: function () {
      return this.anisotropy_8t31yy$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'encoding', {
    get: function () {
      return this.encoding_lvmwcp$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'depthBuffer', {
    get: function () {
      return this.depthBuffer_dwq3yj$_0;
    }
  });
  Object.defineProperty(WebGLRenderTargetOptions.prototype, 'stencilBuffer', {
    get: function () {
      return this.stencilBuffer_2ho3j0$_0;
    }
  });
  WebGLRenderTargetOptions.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'WebGLRenderTargetOptions',
    interfaces: []
  };
  WebGLRenderTargetOptions.prototype.component1 = function () {
    return this.wrapS;
  };
  WebGLRenderTargetOptions.prototype.component2 = function () {
    return this.wrapT;
  };
  WebGLRenderTargetOptions.prototype.component3 = function () {
    return this.magFilter;
  };
  WebGLRenderTargetOptions.prototype.component4 = function () {
    return this.minFilter;
  };
  WebGLRenderTargetOptions.prototype.component5 = function () {
    return this.format;
  };
  WebGLRenderTargetOptions.prototype.component6 = function () {
    return this.type;
  };
  WebGLRenderTargetOptions.prototype.component7 = function () {
    return this.anisotropy;
  };
  WebGLRenderTargetOptions.prototype.component8 = function () {
    return this.encoding;
  };
  WebGLRenderTargetOptions.prototype.component9 = function () {
    return this.depthBuffer;
  };
  WebGLRenderTargetOptions.prototype.component10 = function () {
    return this.stencilBuffer;
  };
  WebGLRenderTargetOptions.prototype.copy_461kpo$ = function (wrapS, wrapT, magFilter, minFilter, format, type, anisotropy, encoding, depthBuffer, stencilBuffer) {
    return new WebGLRenderTargetOptions(wrapS === void 0 ? this.wrapS : wrapS, wrapT === void 0 ? this.wrapT : wrapT, magFilter === void 0 ? this.magFilter : magFilter, minFilter === void 0 ? this.minFilter : minFilter, format === void 0 ? this.format : format, type === void 0 ? this.type : type, anisotropy === void 0 ? this.anisotropy : anisotropy, encoding === void 0 ? this.encoding : encoding, depthBuffer === void 0 ? this.depthBuffer : depthBuffer, stencilBuffer === void 0 ? this.stencilBuffer : stencilBuffer);
  };
  WebGLRenderTargetOptions.prototype.toString = function () {
    return 'WebGLRenderTargetOptions(wrapS=' + Kotlin.toString(this.wrapS) + (', wrapT=' + Kotlin.toString(this.wrapT)) + (', magFilter=' + Kotlin.toString(this.magFilter)) + (', minFilter=' + Kotlin.toString(this.minFilter)) + (', format=' + Kotlin.toString(this.format)) + (', type=' + Kotlin.toString(this.type)) + (', anisotropy=' + Kotlin.toString(this.anisotropy)) + (', encoding=' + Kotlin.toString(this.encoding)) + (', depthBuffer=' + Kotlin.toString(this.depthBuffer)) + (', stencilBuffer=' + Kotlin.toString(this.stencilBuffer)) + ')';
  };
  WebGLRenderTargetOptions.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.wrapS) | 0;
    result = result * 31 + Kotlin.hashCode(this.wrapT) | 0;
    result = result * 31 + Kotlin.hashCode(this.magFilter) | 0;
    result = result * 31 + Kotlin.hashCode(this.minFilter) | 0;
    result = result * 31 + Kotlin.hashCode(this.format) | 0;
    result = result * 31 + Kotlin.hashCode(this.type) | 0;
    result = result * 31 + Kotlin.hashCode(this.anisotropy) | 0;
    result = result * 31 + Kotlin.hashCode(this.encoding) | 0;
    result = result * 31 + Kotlin.hashCode(this.depthBuffer) | 0;
    result = result * 31 + Kotlin.hashCode(this.stencilBuffer) | 0;
    return result;
  };
  WebGLRenderTargetOptions.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.wrapS, other.wrapS) && Kotlin.equals(this.wrapT, other.wrapT) && Kotlin.equals(this.magFilter, other.magFilter) && Kotlin.equals(this.minFilter, other.minFilter) && Kotlin.equals(this.format, other.format) && Kotlin.equals(this.type, other.type) && Kotlin.equals(this.anisotropy, other.anisotropy) && Kotlin.equals(this.encoding, other.encoding) && Kotlin.equals(this.depthBuffer, other.depthBuffer) && Kotlin.equals(this.stencilBuffer, other.stencilBuffer)))));
  };
  function WebGLRendererParams(canvas, alpha, depth, stencil, antialias, premultipliedAlpha, preserveDrawingBuffer) {
    if (canvas === void 0)
      canvas = undefined;
    if (alpha === void 0)
      alpha = undefined;
    if (depth === void 0)
      depth = undefined;
    if (stencil === void 0)
      stencil = undefined;
    if (antialias === void 0)
      antialias = undefined;
    if (premultipliedAlpha === void 0)
      premultipliedAlpha = undefined;
    if (preserveDrawingBuffer === void 0)
      preserveDrawingBuffer = undefined;
    this.canvas_lb56ho$_0 = canvas;
    this.alpha_hi68x2$_0 = alpha;
    this.depth_g6votn$_0 = depth;
    this.stencil_416hj0$_0 = stencil;
    this.antialias_3jd8qe$_0 = antialias;
    this.premultipliedAlpha_r8vzfw$_0 = premultipliedAlpha;
    this.preserveDrawingBuffer_u9kvyy$_0 = preserveDrawingBuffer;
  }
  Object.defineProperty(WebGLRendererParams.prototype, 'canvas', {
    get: function () {
      return this.canvas_lb56ho$_0;
    }
  });
  Object.defineProperty(WebGLRendererParams.prototype, 'alpha', {
    get: function () {
      return this.alpha_hi68x2$_0;
    }
  });
  Object.defineProperty(WebGLRendererParams.prototype, 'depth', {
    get: function () {
      return this.depth_g6votn$_0;
    }
  });
  Object.defineProperty(WebGLRendererParams.prototype, 'stencil', {
    get: function () {
      return this.stencil_416hj0$_0;
    }
  });
  Object.defineProperty(WebGLRendererParams.prototype, 'antialias', {
    get: function () {
      return this.antialias_3jd8qe$_0;
    }
  });
  Object.defineProperty(WebGLRendererParams.prototype, 'premultipliedAlpha', {
    get: function () {
      return this.premultipliedAlpha_r8vzfw$_0;
    }
  });
  Object.defineProperty(WebGLRendererParams.prototype, 'preserveDrawingBuffer', {
    get: function () {
      return this.preserveDrawingBuffer_u9kvyy$_0;
    }
  });
  WebGLRendererParams.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'WebGLRendererParams',
    interfaces: []
  };
  WebGLRendererParams.prototype.component1 = function () {
    return this.canvas;
  };
  WebGLRendererParams.prototype.component2 = function () {
    return this.alpha;
  };
  WebGLRendererParams.prototype.component3 = function () {
    return this.depth;
  };
  WebGLRendererParams.prototype.component4 = function () {
    return this.stencil;
  };
  WebGLRendererParams.prototype.component5 = function () {
    return this.antialias;
  };
  WebGLRendererParams.prototype.component6 = function () {
    return this.premultipliedAlpha;
  };
  WebGLRendererParams.prototype.component7 = function () {
    return this.preserveDrawingBuffer;
  };
  WebGLRendererParams.prototype.copy_cflky8$ = function (canvas, alpha, depth, stencil, antialias, premultipliedAlpha, preserveDrawingBuffer) {
    return new WebGLRendererParams(canvas === void 0 ? this.canvas : canvas, alpha === void 0 ? this.alpha : alpha, depth === void 0 ? this.depth : depth, stencil === void 0 ? this.stencil : stencil, antialias === void 0 ? this.antialias : antialias, premultipliedAlpha === void 0 ? this.premultipliedAlpha : premultipliedAlpha, preserveDrawingBuffer === void 0 ? this.preserveDrawingBuffer : preserveDrawingBuffer);
  };
  WebGLRendererParams.prototype.toString = function () {
    return 'WebGLRendererParams(canvas=' + Kotlin.toString(this.canvas) + (', alpha=' + Kotlin.toString(this.alpha)) + (', depth=' + Kotlin.toString(this.depth)) + (', stencil=' + Kotlin.toString(this.stencil)) + (', antialias=' + Kotlin.toString(this.antialias)) + (', premultipliedAlpha=' + Kotlin.toString(this.premultipliedAlpha)) + (', preserveDrawingBuffer=' + Kotlin.toString(this.preserveDrawingBuffer)) + ')';
  };
  WebGLRendererParams.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.canvas) | 0;
    result = result * 31 + Kotlin.hashCode(this.alpha) | 0;
    result = result * 31 + Kotlin.hashCode(this.depth) | 0;
    result = result * 31 + Kotlin.hashCode(this.stencil) | 0;
    result = result * 31 + Kotlin.hashCode(this.antialias) | 0;
    result = result * 31 + Kotlin.hashCode(this.premultipliedAlpha) | 0;
    result = result * 31 + Kotlin.hashCode(this.preserveDrawingBuffer) | 0;
    return result;
  };
  WebGLRendererParams.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.canvas, other.canvas) && Kotlin.equals(this.alpha, other.alpha) && Kotlin.equals(this.depth, other.depth) && Kotlin.equals(this.stencil, other.stencil) && Kotlin.equals(this.antialias, other.antialias) && Kotlin.equals(this.premultipliedAlpha, other.premultipliedAlpha) && Kotlin.equals(this.preserveDrawingBuffer, other.preserveDrawingBuffer)))));
  };
  var package$info = _.info || (_.info = {});
  var package$laht = package$info.laht || (package$info.laht = {});
  var package$threekt = package$laht.threekt || (package$laht.threekt = {});
  var package$math = package$threekt.math || (package$threekt.math = {});
  Object.defineProperty(package$math, 'ColorConstants', {
    get: ColorConstants_getInstance
  });
  package$math.unaryMinus_kyshpr$ = unaryMinus;
  package$math.plusAssign_gulir3$ = plusAssign;
  package$math.plus_gulir3$ = plus;
  package$math.minusAssign_gulir3$ = minusAssign;
  package$math.minus_gulir3$ = minus;
  package$math.times_gulir3$ = times;
  package$math.timesAssign_gulir3$ = timesAssign;
  var package$renderers = package$threekt.renderers || (package$threekt.renderers = {});
  package$renderers.WebGLRenderTargetOptions = WebGLRenderTargetOptions;
  package$renderers.WebGLRendererParams = WebGLRendererParams;
  Kotlin.defineModule('wrapper', _);
  return _;
}(typeof wrapper === 'undefined' ? {} : wrapper, kotlin);
