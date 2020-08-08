function makeOrderList(oldList, mainBody) {
    let listDataRaw = document.getElementById(oldList);
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
    document.getElementById(mainBody).appendChild(listContainer)
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

function makeNode(nodeText) {
    let myNode = document.createElement('p');
    if (nodeText == "NULL") {
        myNode.setAttribute("class", "treenodenull");
        return myNode;
    }
    myNode.setAttribute("class", "treenode");
    myNode.innerHTML = "            " + "\n" + nodeText;
    return myNode;
}

function makeDiv(whereToAttach, howManyTimes) {
    for (let i = 0; i < howManyTimes; i++) {
        document.getElementById(whereToAttach).append(document.createElement("br"));
    }
}

function makeTree(numList, myBody) {
    let myList = [6,4,8,3,5,7,9];
    let rowCount = 1;
    let listCount = 0;
    while (listCount < myList.length) {
        for (let i = 0; i < rowCount; i++) {

        }
        makeDiv(myBody, 3);
        rowCount *= 2;
    }
}