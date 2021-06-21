window.addEventListener('DOMContentLoaded', () => {
    const registerForm = window.document.getElementById('registerForm');
    registerForm.onsubmit = () => {
        let inputs = registerForm.querySelectorAll('input');
        for (let i = 0; i < inputs.length; i++) {
            let input = inputs[i];
            if (input.dataset.regex !== undefined) {
                let regex = new RegExp(input.dataset.regex);
                let name = input.getAttribute('placeholder');
                if (!regex.test(input.value)) {
                    alert(`올바른 ${name}값을 입력해주세요.`);
                    input.focus();
                    return false;
                }
            }
        }
    };

    const registerInput = registerForm.querySelectorAll(':scope > input');
// TODO : addeventlistener 'blur' >> AJAX >> email, nickname, securityCode

});