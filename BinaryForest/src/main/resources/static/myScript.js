function makeOrderList() {
    let listDataRaw = document.getElementById("orderslist");
    let listDataRawText = listDataRaw.textContent;
    listDataRaw.parentNode.removeChild(listDataRaw);
    let listData = listDataRawText.split(";");
    // Make a container element for the list
    listContainer = document.createElement('div'),
    // Make the list
    listElement = document.createElement('ul'),
    // Set up a loop that goes through the items in listItems one at a time
    numberOfListItems = listData.length,

    // Add it to the page
    //document.getElementsByTagName('body')[0].appendChild(listContainer);
    document.getElementById("treebody").appendChild(listContainer)
    listContainer.appendChild(listElement);

    for (let i = 0; i < numberOfListItems - 1; ++i) {
        // create an item for each one
        let listItem = document.createElement('li');

        // Add the item text
        listItem.innerHTML = listData[i];

        // Add listItem to the listElement
        listElement.appendChild(listItem);
    }
}