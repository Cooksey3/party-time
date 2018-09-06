let _ajax = null;

const xhr = new XMLHttpRequest();
xhr.onreadystatechange = function() {
	if (this.readyState === 4 && this.status === 200) {
		const res = JSON.parse(xhr.responseText);
		_ajax = res._embedded.restaurants;

		const checklistArray = Array.from(document.querySelectorAll('.checklist'))
		for (let el of checklistArray) {
			el.addEventListener('click', () => {
				if(el.checked) {
					const foodType = document.querySelector('#food-type')
					const list = document.createElement("ul");
					list.className = "linkList"
					appendElement(foodType, list)
					for (let i = 0; i < _ajax.length; i++) {
						if(el.name === _ajax[i].foodType) {
							console.log(_ajax[i].url)
							let listItem = document.createElement("li");
							const restaurantLink = document.createElement("a")
							listItem.id = "listItem-" + i;
							listItem.className = "listItem"
							listItem.className += (" " + el.name)
							restaurantLink.href = _ajax[i].url;
							restaurantLink.innerText = _ajax[i].name
							appendElement(list, listItem);
							appendElement(listItem, restaurantLink);
						}
					}
				}
				if(!el.checked) {
					let liArray = Array.from(document.querySelectorAll('.listItem'))
					for (var i = liArray.length - 1; i >= 0; i--) {
						if(liArray[i].classList.contains(el.name)) {
							liArray[i].parentNode.removeChild(liArray[i]);
							liArray.splice(i, 1);
						}
					}
					console.log(liArray)
				}
			})
		}
		//Next, I need to give the UL a class, check to see if that class exists, and if it does, do nothing.
	}
}

function appendElement(parent, child){
	parent.appendChild(child)
}

xhr.open("GET", "http://localHost:8080/restaurants", true);
xhr.send();