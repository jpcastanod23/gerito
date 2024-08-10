<%@ attribute name="speakers" required="true" type="java.lang.String" %>

<article>
    <h1>
        Choose your template ${speakers}
    </h1>
    <section>

        <div class="grid">
            <div class="grid-item"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/76301/01.png">
                <button onclick="location.href='/selectTemplate?img=1&' +  'speakers=' + ${speakers}" class="select-image">Select</button>
            </div>
            <div class="grid-item"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/76301/04.png">
                <button onclick="location.href='/selectTemplate?img=1&' +  'speakers=' + ${speakers}" class="select-image">Select</button>
            </div>
            <div class="grid-item"><img src="https://s3-us-west-2.amazonaws.com/s.cdpn.io/76301/06.png">
                <button onclick="location.href='/selectTemplate?img=1&' +  'speakers=' + ${speakers}" class="select-image">Select</button>
            </div>
        </div>
    </section>
</article>