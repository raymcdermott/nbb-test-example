import { addClassPath, loadFile } from 'nbb';

addClassPath("src")

const { handler } = await loadFile('./src/example.cljs');

export { handler }
