<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="speakers" required="true" type="java.lang.String" %>
<%@ attribute name="userName" required="false" type="java.lang.String" %>

<article>
    <h1>
        ${userName},  Choose your template for ${speakers}
            <c:choose>
                <c:when test="${speakers>1}">
                    speakers
                </c:when>
                <c:otherwise>
                    speaker
                </c:otherwise>
            </c:choose>
    </h1>
    <section>

        <div class="grid">
            <div class="grid-item"><img src="../images/fully-templates/template${speakers}-1.png">
                <button onclick="location.href='/selectTemplate?speakers=' + ${speakers} + '&img=1'"
                        class="select-image">Select
                </button>
            </div>
            <div class="grid-item"><img src="../images/fully-templates/template${speakers}-2.png">
                <button onclick="location.href='/selectTemplate?speakers=' + ${speakers} + '&img=2'"
                        class="select-image">Select
                </button>
            </div>
            <div class="grid-item"><img src="../images/fully-templates/template${speakers}-3.png">
                <button onclick="location.href='/selectTemplate?speakers=' + ${speakers} + '&img=3'"
                        class="select-image">Select
                </button>
            </div>
        </div>
    </section>
</article>