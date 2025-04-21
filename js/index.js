function countVowels(str) {
    var count = 0;
    var vowels = ['a', 'e', 'i', 'o', 'u'];
    str = str.toLowerCase();
    for (var i = 0; i < str.length; i++) {
        if (vowels.indexOf(str[i]) !== -1) {
            count++;
        }
    }
    return count;
}

console.log("countVowels('hello'): " + countVowels('hello'));

function flattenAndSort(arr) {
    var flat = arr.flat();
    for (var i = 0; i < flat.length; i++) {
        for (var j = i + 1; j < flat.length; j++) {
            if (flat[i] > flat[j]) {
                var temp = flat[i];
                flat[i] = flat[j];
                flat[j] = temp;
            }
        }
    }
    var unique = [];
    for (var i = 0; i < flat.length; i++) {
        if (unique.indexOf(flat[i]) === -1) {
            unique.push(flat[i]);
        }
    }
    return unique;
}

console.log("flattenAndSort: " + flattenAndSort([[3, 2, 1], [4, 5, 2], [1, 6]]));

function getCategorySummary(expenses) {
    var summary = {};
    for (var i = 0; i < expenses.length; i++) {
        var cat = expenses[i].category;
        var amt = expenses[i].amount;
        if (summary[cat] === undefined) {
            summary[cat] = 0;
        }
        summary[cat] += amt;
    }
    var max = 0;
    var highest = "";
    for (var key in summary) {
        if (summary[key] > max) {
            max = summary[key];
            highest = key;
        }
    }
    summary["highestExpense"] = highest;
    return summary;
}

var expenses = [
    { category: "Food", amount: 120 },
    { category: "Travel", amount: 300 },
    { category: "Food", amount: 80 },
    { category: "Bills", amount: 200 },
    { category: "Travel", amount: 100 }
];

console.log("getCategorySummary: " + getCategorySummary(expenses));
