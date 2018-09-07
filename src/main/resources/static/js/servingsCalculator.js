//1 serving = 1lb of food
	const adults = document.querySelector('#adultCount');
	const kids = document.querySelector('#kidCount');

//if serving lunch or dinner, total servings should = 1 lb of food per person
	//Meat: 6-8 ounces of meat per person

//calculates in lbs
calculateMeatNeeded = () => {
	let foodWeightLow = (((adults.value * 6) + (kids.value * 6)/2)/16).toFixed(2);
	let foodWeightHigh = (((adults.value * 8) + (kids.value * 8)/2)/16).toFixed(2);
	const high = document.querySelector('#high');
	const low = document.querySelector('#low');
	high.textContent = foodWeightHigh;
	low.textContent = foodWeightLow;
}

//Cocktail: No food, or snacks?

//Hor d'oeuvres - 6-10 bites per person


adults.addEventListener('change', calculateMeatNeeded);
kids.addEventListener('change', calculateMeatNeeded);