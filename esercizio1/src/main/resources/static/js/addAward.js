document.getElementById("awardForm").addEventListener("submit", function(event) {
        event.preventDefault();
        const title = document.getElementById("awardName").value;
        const year = document.getElementById("year").value;
        const number = document.getElementById("number").value;

        const tableBody = document.getElementById("individualTable").getElementsByTagName('tbody')[0];

        addRow(tableBody, title, year, number);

        document.getElementById("awardForm").reset();

    });

function addRow(tableBody, awardName, year, number) {

    const newRowHTML = `
        <tr>
            <td>${awardName}</td>
            <td>${year}</td>
            <td>${number}</td>
            <td><button class="btn btn-danger btn-sm deleteButton"><i class="fa-solid fa-trash"></i></button></td>
        </tr>
    `;

    tableBody.innerHTML += newRowHTML;


    document.querySelectorAll(".deleteButton").forEach(button => {
        button.addEventListener("click", function() {
            const row = button.closest("tr");
            row.parentNode.removeChild(row);
        });
    });
}
