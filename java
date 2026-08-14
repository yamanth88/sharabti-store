const button = document.getElementById("buyButton");
const message = document.getElementById("message");

button.addEventListener("click", function () {
    message.textContent = "Added to your cart! 🛒";
});
