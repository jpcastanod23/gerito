document.addEventListener('keyup', function (event) {
    const nameInput = document.getElementById('name');
    const userDiv = document.getElementById('textUser');
    const fullChat = document.getElementById('full-chat');
    if (document.activeElement === nameInput && event.key === 'Enter') {
        let name = nameInput.value;
        userDiv.textContent = name;
        userDiv.style.backgroundColor = "#A3AE4A";
        createBotText(fullChat, name);
        createSpeakerButtons(fullChat, name);
        nameInput.disabled = true;
        nameInput.value = "";
    }
});


function createSpeakerButtons(fullChat) {
    var container = document.createElement('div');
    container.className = 'speakers-container';
    for (let step = 1; step < 4; step++) {
        let button = document.createElement('button');
        button.className = 'speakers-button';
        button.textContent = step.toString();
        button.onclick = function () {
            location.href = "/chooseTemplate?speakers=" + step;
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