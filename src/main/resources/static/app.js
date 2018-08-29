const partyDataController = (() => {
	
	return {
		calculateGuests: (adults, kids) => {
			return adults + kids;
		},

		calculateServings: (adults, kids) => {
			return (adults * 1.5) + kids;

		}
		
	}
})();

const UIController = (() => {
	const DOMstrings = {
		submit: '.submit',
		adults: '.adultCount',
		kids: '.kidCount',
		guestCount: 'guestCount',
		servings: 'servings'
	};
	guestCalc = () => {
		const adultNum = parseInt(document.querySelector(DOMstrings.adults).value);
		const kidNum = parseInt(document.querySelector(DOMstrings.kids).value);
		const total = partyDataController.calculateGuests(adultNum, kidNum);

		// document.getElementById(DOMstrings.guestCount).textContent = total;
	}

	servingsCalc = () => {
		const adultServings = parseFloat(document.querySelector(DOMstrings.adults).value);
		const kidServings = parseFloat(document.querySelector(DOMstrings.kids).value);
		const total = partyDataController.calculateServings(adultServings, kidServings);

		// document.getElementById(DOMstrings.servings).textContent = total;	
	}

	return {

		updateUI: () => {
			guestCalc();
			servingsCalc();
		},

		getDOMstrings: () => {
			return DOMstrings;
		}
			
	}

})();

const controller = ((partyDataController, UIController) => {

	let setupEventListeners = () => {
		const DOM = UIController.getDOMstrings();
		document.querySelector(DOM.submit).addEventListener('click', UIController.updateUI);
	}

	const updateScreen = () => {
		UIController.updateUI();
	}

	return {
		 init: () => {
		 	updateScreen();
		 	setupEventListeners();
		}
	}

})(partyDataController, UIController);

controller.init();