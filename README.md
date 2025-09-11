Uniforms is a simple add-on for Iris mod, which allows you editing certain options in real-time. It's available for Fabric `1.20.4` and `1.20.1` (works on Forge `1.20.1` with Sinytra Connector and Oculus).

Note: while editing parameters, you have to **release the slider** for the value to change.

**IMPORTANT**: some shader packs may not work. This mod is **INCOMPATIBLE** with BBS mod (BBS mod has its own implementation, so you don't need it anyways).

## How?

This mod transforms GLSL code loaded by Iris/Oculus and replaces `#define` based parameters with GLSL uniforms that can be updated from outside of the shader pack. 

Due to the nature of implementation, some options just can't be turned editable in real-time (the ones used in expressions that require constant parameters, i.e. array sizes, and within macros like other `#define`, `#if` and `#elif`).