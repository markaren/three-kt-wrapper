// https://github.com/mrdoob/three.js/blob/master/examples/js/loaders/OBJLoader.js

import {Group, LoadingManager, Material} from "./three-core";
import {MaterialCreator} from "./three-mtlloader";

export class OBJLoader {

    constructor(manager?: LoadingManager);
    manager: LoadingManager;
    regexp: any;
    materials: Material[];
    path: string;

    load(url: string, onLoad: (group: Group) => void, onProgress?: (event: ProgressEvent) => void, onError?: (event: ErrorEvent) => void): void;
    parse(data: string) : Group;
    setPath(value: string) : void;
    setMaterials(materials: MaterialCreator) : void;
    _createParserState() : any;

}
