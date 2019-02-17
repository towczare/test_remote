# 01_calculator-tests

Run existing test located inside `CalculatorTests`. It should pass.


# Exercise

1. Add 3 tests to existing one using different parameters. Here is some examples but feel free to use your own:
```
0 + 101
-5 + -2
-1 + 5
...
```
2. Add new method called `extract` to `Calculator` class. 
```
public int extract(int a, int b) {
    return -1;
}
```
3. Add tests covering this method.
4. Run your tests, they should fail (unless your result is not equal -1)
4. Implement logic required to pass tests.