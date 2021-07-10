<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@include file="../views/includes/header.jsp"%>


<!-- Section-->
<section class="py-5">
	<div class="container px-4 px-lg-5 mt-5">
		<div
			class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">







			<c:forEach var="book" items="${books}">
				<div class="col mb-5 book-item">
					<div class="card h-100">
						<!-- Product image-->
						<img class="card-img-top"
							src="${book.thumbnail}" alt="..." onError="this.src='/resources/img/no_thumnail.png';"/>
						<!-- Product details-->
						<div class="card-body p-4">
							<div class="text-center">
								<!-- Product name-->
								<h5 class="fw-bolder">${book.title}</h5>
								<!-- Product reviews-->
								<div
									class="d-flex justify-content-center small text-warning mb-2">
									<div>${book.author}</div>
								</div>
								<!-- Product price-->
								${book.price} 원
							</div>
						</div>
						<!-- Product actions-->
						<div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
							<div class="text-center">
								<a class="btn btn-outline-dark mt-auto" href="/book/item/${book.id}">상세보기</a>
							</div>
						</div>
					</div>
				</div>


			</c:forEach>








		</div>
	</div>
</section>


<%@include file="../views/includes/footer.jsp"%>