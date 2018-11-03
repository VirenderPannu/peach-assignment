let getPossibleMobileNumbers = function(digits,reservedPrefixesArray) {
    let totalPossibilities = Math.pow(10,digits);
    return reservedPrefixesArray.reduce( function(reservedPrefixesPossibilities,item) {
        reservedPrefixesPossibilities = reservedPrefixesPossibilities - Math.pow(10, digits-item.length);
                return reservedPrefixesPossibilities;
            },totalPossibilities)				
}

let reservedPrefixesArray = ["0", "2", "100"]
console.log(getPossibleMobileNumbers(7 , reservedPrefixesArray));
reservedPrefixesArray = ["1", "2", "3"]
console.log(getPossibleMobileNumbers(6 , reservedPrefixesArray));
reservedPrefixesArray = ["10", "20"]
console.log(getPossibleMobileNumbers(3 , reservedPrefixesArray));
