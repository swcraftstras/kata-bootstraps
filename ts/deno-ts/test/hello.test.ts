import {assertEquals} from "https://deno.land/std@0.165.0/testing/asserts.ts"; // import dependencies from urls
import {hello} from "../src/hello.ts";

// See also /docs/deno-test-showcase.md

Deno.test("Hello", async (t) => {

    await t.step("without subject", () => {
        assertEquals(hello(), "Hello World!");
    });

    await t.step("with subject", () => {
        assertEquals(hello("Dojo"), "Hello Dojo!");
    });

});
