# 05_coverage-tests

Have you ever heard of Latte Factor? Here is couple links explaining this term:
* [https://www.modestmoney.com/the-latte-factor/1283](https://www.modestmoney.com/the-latte-factor/1283)
* [https://www.forbes.com/sites/robertberger/2017/05/27/the-latte-factor-7-key-lessons-we-can-learn-from-a-cup-of-coffee/](https://www.forbes.com/sites/robertberger/2017/05/27/the-latte-factor-7-key-lessons-we-can-learn-from-a-cup-of-coffee/)

TLDR: `Latte Factor - (economics) The phenomenon whereby many small purchases add up to a significant expenditure over time.`

Run existing test with coverage option located inside `MoneySavingCalculatorTest`.
All test should pass and you should notice 100% coverage.



# Exercise

1. Try to implement rest of `SavingFrequency` values so it calculates right values and keeps 100% coverage.
2. For example, here is one of the scenario, which should be covered during this exercise:
```
If I am saving 1.23 PLN each day for next 138 days, I should save `169.74 PLN`
If I am saving 2 PLN each week for next 100 days, I should save `28 PLN` 
and so on...
```
3. More advance version should allow to estimate savings in long term based on ROI percentage value. Example:
```
If I am saving 10 PLN each week for next 10 years, and put it on 3% bank saving account I should save `6055.46 PLN` 
```
Check out this online calculator which might help you to develop right solution [https://financialmentor.com/calculator/latte-factor-calculator](https://financialmentor.com/calculator/latte-factor-calculator)
