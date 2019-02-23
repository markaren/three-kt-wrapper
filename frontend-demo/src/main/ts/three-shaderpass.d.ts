import {IUniform, Mesh, OrthographicCamera, Scene, Shader, ShaderMaterial} from "./three-core";
import {Pass} from "./three-effectcomposer";

export class ShaderPass extends Pass {
    constructor(shader: Shader, textureID?: string);

    textureID: string;
    uniforms: { [uniform: string]: IUniform };
    material: ShaderMaterial;
    camera: OrthographicCamera;
    scene: Scene;
    quad: Mesh;
}