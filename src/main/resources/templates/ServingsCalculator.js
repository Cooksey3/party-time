//1 serving = 1lb of food
var adultServings = 1;
var kidServings = .5;

var container = document.querySelector('.container')

logMealTypeValue = () => {
	var log = document.querySelector('#meal').value;
	console.log(log)
}

container.addEventListener('click', console.log('Hello'));