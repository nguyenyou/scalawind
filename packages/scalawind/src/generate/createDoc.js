import { transform } from 'lightningcss';

export function createDoc(doc) {
  try {
    let cssDoc = `/** {{{
    * ${transform({
      filename: 'doc.css',
      code: Buffer.from(doc),
    })
      .code.toString()
      .replace(/\\\//g, "/")
      .replace(/\\\./g, ".")
      .replace(/\n/g, '\n    * ')}}}}
    */`;
    return cssDoc;
  } catch (error) {
    return "";
  }
}