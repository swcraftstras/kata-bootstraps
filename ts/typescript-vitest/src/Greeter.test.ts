import { assert, expect, test } from "vitest"
import Greeter from "./Greeter"

test("Greets the world", () => {
    const greeter = new Greeter();
    const result = greeter.greet();

    expect(result).toBe("Hello World!")
})

test("Greets someone", () => {
    const greeter = new Greeter();
    const result = greeter.greet("Bob");

    expect(result).toBe("Hello Bob!")
})