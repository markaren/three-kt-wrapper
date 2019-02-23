import {IUniform, Mesh, OrthographicCamera, Scene, ShaderMaterial} from "./three-core";
import {Pass} from "./three-effectcomposer";

export class FilmPass extends Pass {
    constructor(noiseIntensity?: number, scanlinesIntensity?: number, scanlinesCount?: number, grayscale?: boolean);
    
    scene: Scene;
    camera: OrthographicCamera;
    uniforms: { [uniform: string]: IUniform };
    material: ShaderMaterial;
    quad: Mesh;

}
