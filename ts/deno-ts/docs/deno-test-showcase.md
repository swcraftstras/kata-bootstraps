# Deno test showcase

More examples of test features.

Se also https://deno.land/manual@v1.28.1/basics/testing

```ts
import {assertEquals} from "https://deno.land/std@0.165.0/testing/asserts.ts";

Deno.test("Deno test lib showcase", async (t) => {

    // provide a step name and function
    await t.step("step a", async () => {
        assertEquals(1, 1);
        assertEquals("Deno", "Deno");
    });

    // or provide a test definition
    await t.step({
        name: "step B",
        fn: async () => {
            assertEquals(1, 1);
            assertEquals("The Dino Manual", "The Deno Manual");
        },
        ignore: false,
        // these default to the parent test or step's value
        sanitizeOps: true,
        sanitizeResources: true,
        sanitizeExit: true,
    });

    // nested steps are also supported
    await t.step("Nested step C", async (t) => {
        await t.step("substep C.1", () => {
            // even though this test throws, the outer promise does not reject
            // and the next test step will run
            throw new Error("Fail.");
        });

        await t.step("substep C.2", () => {
            // ...etc...
        });
    });

    // steps return a value saying if they ran or not
    const testRan = await t.step({
        name: "copy books",
        fn: () => {
            // ...etc...
        },
        ignore: true, // was ignored, so will return `false`
    });

    // steps can be run concurrently if sanitizers are disabled on sibling steps
    const testCases = [1, 2, 3];
    await Promise.all(testCases.map((testCase) =>
        t.step({
            name: `case ${testCase}`,
            fn: async () => {
                // ...etc...
            },
            sanitizeOps: false,
            sanitizeResources: false,
            sanitizeExit: false,
        })
    ));

});
```
