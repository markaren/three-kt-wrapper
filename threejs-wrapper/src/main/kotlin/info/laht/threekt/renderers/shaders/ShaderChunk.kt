/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.renderers.shaders

external object ShaderChunk {
    val alphamap_fragment: String
    val alphamap_pars_fragment: String
    val alphatest_fragment: String
    val aomap_fragment: String
    val aomap_pars_fragment: String
    val begin_vertex: String
    val beginnormal_vertex: String
    val bsdfs: String
    val bumpmap_pars_fragment: String
    val clipping_planes_fragment: String
    val clipping_planes_pars_fragment: String
    val clipping_planes_pars_vertex: String
    val clipping_planes_vertex: String
    val color_fragment: String
    val color_pars_fragment: String
    val color_pars_vertex: String
    val color_vertex: String
    val common: String
    val cube_uv_reflection_fragment: String
    val defaultnormal_vertex: String
    val displacementmap_pars_vertex: String
    val displacementmap_vertex: String
    val emissivemap_fragment: String
    val emissivemap_pars_fragment: String
    val encodings_fragment: String
    val encodings_pars_fragment: String
    val envmap_fragment: String
    val envmap_pars_fragment: String
    val envmap_pars_vertex: String
    val envmap_vertex: String
    val fog_vertex: String
    val fog_pars_vertex: String
    val fog_fragment: String
    val fog_pars_fragment: String
    val gradientmap_pars_fragment: String
    val lightmap_fragment: String
    val lightmap_pars_fragment: String
    val lights_lambert_vertex: String
    val lights_pars: String
    val lights_phong_fragment: String
    val lights_phong_pars_fragment: String
    val lights_physical_fragment: String
    val lights_physical_pars_fragment: String
    val lights_template: String
    val logdepthbuf_fragment: String
    val logdepthbuf_pars_fragment: String
    val logdepthbuf_pars_vertex: String
    val logdepthbuf_vertex: String
    val map_fragment: String
    val map_pars_fragment: String
    val map_particle_fragment: String
    val map_particle_pars_fragment: String
    val metalnessmap_fragment: String
    val metalnessmap_pars_fragment: String
    val morphnormal_vertex: String
    val morphtarget_pars_vertex: String
    val morphtarget_vertex: String
    val normal_fragment: String
    val normalmap_pars_fragment: String
    val packing: String
    val premultiplied_alpha_fragment: String
    val project_vertex: String
    val dithering_fragment: String
    val dithering_pars_fragment: String
    val roughnessmap_fragment: String
    val roughnessmap_pars_fragment: String
    val shadowmap_pars_fragment: String
    val shadowmap_pars_vertex: String
    val shadowmap_vertex: String
    val shadowmask_pars_fragment: String
    val skinbase_vertex: String
    val skinning_pars_vertex: String
    val skinning_vertex: String
    val skinnormal_vertex: String
    val specularmap_fragment: String
    val specularmap_pars_fragment: String
    val tonemapping_fragment: String
    val tonemapping_pars_fragment: String
    val uv_pars_fragment: String
    val uv_pars_vertex: String
    val uv_vertex: String
    val uv2_pars_fragment: String
    val uv2_pars_vertex: String
    val uv2_vertex: String
    val worldpos_vertex: String

    val cube_frag: String
    val cube_vert: String
    val depth_frag: String
    val depth_vert: String
    val distanceRGBA_frag: String
    val distanceRGBA_vert: String
    val equirect_frag: String
    val equirect_vert: String
    val linedashed_frag: String
    val linedashed_vert: String
    val meshbasic_frag: String
    val meshbasic_vert: String
    val meshlambert_frag: String
    val meshlambert_vert: String
    val meshphong_frag: String
    val meshphong_vert: String
    val meshphysical_frag: String
    val meshphysical_vert: String
    val normal_frag: String
    val normal_vert: String
    val points_frag: String
    val points_vert: String
    val shadow_frag: String
    val shadow_vert: String
}