function makeOrderList(oldList, mainBody) {
    let listDataRaw = document.getElementById(oldList);
    let listDataRawText = listDataRaw.textContent;
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
    return listData[listData.length - 1];
}

function makeNode(nodeText) {
    let myNode = document.createElement('p');
    myNode.innerHTML = "            " + "\n" + nodeText;
    if (nodeText == "NULL") {
        myNode.setAttribute("class", "treenodenull");
        return myNode;
    }
    myNode.setAttribute("class", "treenode");
    return myNode;
}

function makeDiv(whereToAttach, howManyTimes) {
    for (let i = 0; i < howManyTimes; i++) {
        whereToAttach.append(document.createElement("br"));
    }
}

function makeTree(numListRaw, myBody) {
    let treeDiv = document.createElement('div');
    treeDiv.setAttribute("class", "tree-div");
    document.getElementById(myBody).appendChild(treeDiv)
    makeDiv(treeDiv, 1);
    let numList = numListRaw.split(",");
    let rowCount = 1;
    let listCount = 1;
    while (listCount < numList.length) {
        let currentDiv = document.createElement('div');
        currentDiv.setAttribute("class", "tree-row");
        for (let i = 0; i < rowCount; i++) {
            currentDiv.appendChild(makeNode(numList[listCount]));
            listCount += 1;
        }
        treeDiv.appendChild(currentDiv);
        makeDiv(treeDiv, 1);
        rowCount *= 2;
    };
}