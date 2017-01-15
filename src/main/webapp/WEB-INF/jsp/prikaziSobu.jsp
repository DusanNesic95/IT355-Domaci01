<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
    <head>
        <title>Prikaz sobe hotela</title>
    </head>
    <body>

        <h2>Podaci o sobi</h2>
        <table>
            <tr>
                <td>Broj kreveta:</td>
                <td>${brojKreveta}</td>
            </tr>
            <tr>
                <td>Velicina:</td>
                <td>${velicina}</td>
            </tr>
            <tr>
                <td>Kupatilo:</td>
                <td>${kupatilo}</td>
            </tr>
            <tr>
                <td>TV:</td>
                <td>${tv}</td>
            </tr>
            <tr>
                <td>Klima:</td>
                <td>${klima}</td>
            </tr>
            <tr>
                <td>Cena po danu:</td>
                <td>${cenaPoDanu}</td>
            </tr>
        </table>
    </body>
</html>