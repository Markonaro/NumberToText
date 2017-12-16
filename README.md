# NumberToText

	
The primary function numToWords takes any Integer between 1 and 9999 (inclusive) and outputs its corresponding English words, followed by the String of digits in parenthesis.

Example: If Integer x = 2614;, numToText(x); returns "Two Thousand Six Hundred Fourteen (2614)":

The digit-equivalent words are stored in HashMaps depending on whether they're multiples of 1 or 10 (e.g. 6 --> "Six", 60 --> "Sixty") while the teens are handled independently with a switch statement.
