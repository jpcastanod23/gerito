document.addEventListener('keyup', function (event) {
    const nameInput = document.getElementById('name');
    const userDiv = document.getElementById('textUser');
    const fullChat = document.getElementById('full-chat');
    if (document.activeElement === nameInput && event.key === 'Enter') {
        let name = nameInput.value;
        userDiv.textContent = name;
        userDiv.style.backgroundColor = "#CCCCCC";
        createBotText(fullChat, name);
        createSpeakerButtons(fullChat, name);
        nameInput.disabled = true;
        nameInput.value = "";
    }
});


// Get the image and insert it inside the modal - use its "alt" text as a caption
var modal = document.getElementById('imgModal');

function imgOnClick(img) {
    let modal2 = document.getElementById('imgModal');
    let modalImg2 = document.getElementById("img01");
    let captionText2 = document.getElementById("caption");

    modal2.style.display = "block";
    modalImg2.src = img.src;
    modalImg2.alt = img.alt;
    captionText2.innerHTML = img.alt;
}


// When the user clicks on <span> (x), close the modal
function modalOnClick() {
    let modal = document.getElementById('imgModal');
    img01.className += " out";
    setTimeout(function () {
        modal.style.display = "none";
        img01.className = "modal-content";
    }, 400);

}


function createSpeakerButtons(fullChat, name) {
    let container = document.createElement('div');
    container.className = 'speakers-container';
    for (let step = 1; step < 4; step++) {
        let button = document.createElement('button');
        button.className = 'speakers-button';
        button.textContent = step.toString();
        button.onclick = function () {
            location.href = "/chooseTemplate?speakers=" + step + "&name=" + name;
        };
        container.append(button);
    }
    fullChat.append(container);
}

function createBotText(fullChat, name) {
    let botText = document.createElement('div');
    botText.className = 'bot-text';
    let text = document.createElement('div');
    text.className = 'text';
    text.textContent = "Glad to help you, " + name + " How many speakers do you need in your template?"
    botText.append(text);
    fullChat.append(botText);
}