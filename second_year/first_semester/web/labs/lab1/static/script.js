const form = document.getElementById("testForm");

const responseEl = document.getElementById("response");

form.addEventListener("submit", (e) => {

  e.preventDefault();

  const x = document.getElementById("x").value;

  const y = document.getElementById("y").value;

  const r = document.getElementById("r").value;

  fetch(`/~s463223/fcgi-bin/Server.jar?x=${x}&y=${y}&r=${r}`)

    .then((res) => res.json())

    .then((data) => {

      responseEl.textContent = JSON.stringify(data, null, 2);

    })

    .catch((err) => {

      responseEl.textContent = "Error: " + err;

    });

}); 