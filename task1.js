function generateParentheses(n) {
  const validParenthesesCombinations = [];
  function buildParenthesesCombination(
    text,
    openingParentheses,
    closingParentheses
  ) {
    if (text.length === 6) {
      validParenthesesCombinations.push(text);
      return;
    }
    if (openingParentheses < n) {
      buildParenthesesCombination(
        text + "(",
        openingParentheses + 1,
        closingParentheses
      );
    }
    if (closingParentheses < openingParentheses) {
      buildParenthesesCombination(
        text + ")",
        openingParentheses,
        closingParentheses + 1
      );
    }
  }
  buildParenthesesCombination("", 0, 0);
  return validParenthesesCombinations;
}
console.log(generateParentheses(3));
