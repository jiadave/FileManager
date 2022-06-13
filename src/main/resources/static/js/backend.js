function popupText() {
    var input_value = document.getElementById("input").value
    alert("You wrote " + input_value);
}

function callJavaApi() {
    alert("Calling Java api")
    fetch("http://localhost/writeToFile")
        .then(response => response.json())
        .then(json => console.log(json));
}