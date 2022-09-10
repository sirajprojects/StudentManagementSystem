import React from "react"; import { Outlet, Link } from "react-router-dom";

function ParentsDetails() {
  return (
    <body>
      {/* <!-- Preloader Start Here --> */}
      <div id="preloader"></div>
      {/* <!-- Preloader End Here --> */}
      <div id="wrapper" className="wrapper bg-ash">
        {/* <!-- Header Menu Area Start Here --> */}
        <div className="navbar navbar-expand-md header-menu-one bg-light">
          <div className="nav-bar-header-one">
            <div className="header-logo"></div>
            <div className="toggle-button sidebar-toggle">
              <button type="button" className="item-link">
                <span className="btn-icon-wrap">
                  <span></span>
                  <span></span>
                  <span></span>
                </span>
              </button>
            </div>
          </div>
          <div className="d-md-none mobile-nav-bar">
            <button
              className="navbar-toggler pulse-animation"
              type="button"
              data-toggle="collapse"
              data-target="#mobile-navbar"
              aria-expanded="false"
            >
              <i className="far fa-arrow-alt-circle-down"></i>
            </button>
            <button type="button" className="navbar-toggler sidebar-toggle-mobile">
              <i className="fas fa-bars"></i>
            </button>
          </div>
          <div
            className="header-main-menu collapse navbar-collapse"
            id="mobile-navbar"
          >
            <ul className="navbar-nav"></ul>
            <ul className="navbar-nav"></ul>
          </div>
        </div>
        {/* <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here --> */}
        <div className="dashboard-page-one">
          {/* <!-- Sidebar Area Start Here --> */}
          <div className="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
            <div className="mobile-sidebar-header d-md-none">
              <div className="header-logo">
                 <Link to="/index.html">
                  <img src="img/logo1.png" alt="logo" />
               </Link>
              </div>
            </div>
            <div className="sidebar-menu-content">
              <ul className="nav nav-sidebar-menu sidebar-toggle-view">
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-classmates"></i>
                    <span>Students</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-student.html" className="nav-link">
                        <i className=""></i>All Students
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/student-details.html" className="nav-link">
                        <i className=""></i>Student Details
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/admit-form.html" className="nav-link">
                        <i className=""></i>Admission Form
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-multiple-users-silhouette"></i>
                    <span>Teachers</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-teacher.html" className="nav-link">
                        <i className=""></i>All Teachers
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/teacher-details.html" className="nav-link">
                        <i className=""></i>Teacher Details
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-teacher.html" className="nav-link">
                        <i className=""></i>Add Teacher
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-couple"></i>
                    <span>Parents</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-parents.html" className="nav-link">
                        <i className=""></i>All Parents
                     </Link>
                    </li>
                    <li className="nav-item">
                    <Link to="/parents-details.html"
                        className="nav-link menu-active"
                      >
                        <i className=""></i>Parents Details
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-parents.html" className="nav-link">
                        <i className=""></i>Add Parent
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-books"></i>
                    <span>Library</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-book.html" className="nav-link">
                        <i className=""></i>All Book
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-book.html" className="nav-link">
                        <i className=""></i>Add New Book
                     </Link>
                    </li>
                  </ul>
                </li>

                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-maths-class-materials-cross-of-a-pencil-and-a-ruler"></i>
                    <span>Class</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/all-class.html" className="nav-link">
                        <i className=""></i>All Classes
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/add-class.html" className="nav-link">
                        <i className=""></i>Add New Class
                     </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item">
                   <Link to="/all-subject.html" className="nav-link">
                    <i className="flaticon-open-book"></i>
                    <span>Subject</span>
                 </Link>
                </li>
                <li className="nav-item">
                   <Link to="/class-routine.html" className="nav-link">
                    <i className="flaticon-calendar"></i>
                    <span>Class Routine</span>
                 </Link>
                </li>
                <li className="nav-item">
                   <Link to="/student-attendence.html" className="nav-link">
                    <i className="flaticon-checklist"></i>
                    <span>Attendence</span>
                 </Link>
                </li>
                <li className="nav-item sidebar-nav-item">
                   <Link to="/#" className="nav-link">
                    <i className="flaticon-shopping-list"></i>
                    <span>Exam</span>
                 </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                       <Link to="/exam-schedule.html" className="nav-link">
                        <i className=""></i>Exam Schedule
                     </Link>
                    </li>
                    <li className="nav-item">
                       <Link to="/exam-grade.html" className="nav-link">
                        <i className=""></i>Exam Grades
                     </Link>
                    </li>
                  </ul>
                </li>

                <li className="nav-item">
                   <Link to="/account-settings.html" className="nav-link">
                    <i className="flaticon-settings"></i>
                    <span>Account</span>
                 </Link>
                </li>
              </ul>
            </div>
          </div>
          {/* <!-- Sidebar Area End Here --> */}
          <div className="dashboard-content-one">
            {/* <!-- Breadcubs Area Start Here --> */}
            <div className="breadcrumbs-area">
              <h3>Parents</h3>
              <ul>
                <li>
                   <Link to="/index.html">Home</Link>
                </li>
                <li>Parents Details</li>
              </ul>
            </div>
            {/* <!-- Breadcubs Area End Here -->
                <!-- Student Details Area Start Here --> */}
            <div className="card height-auto">
              <div className="card-body">
                <div className="heading-layout1">
                  <div className="item-title">
                    <h3>About Me</h3>
                  </div>
                </div>
                <div className="single-info-details">
                  <div className="item-img"></div>
                  <div className="item-content">
                    <div className="header-inline item-header">
                      <h3 className="text-dark-medium font-medium"></h3>`
                    </div>

                    <div className="info-table table-responsive">
                      <table className="table text-nowrap">
                        <tbody>
                          <tr>
                            <td>Name:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Gender:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Occupation:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>ID:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Address:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Religion:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>Phone:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                          <tr>
                            <td>E-mail:</td>
                            <td className="font-medium text-dark-medium"></td>
                          </tr>
                        </tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            {/* <!-- Student Details Area End Here --> */}
            <footer className="footer-wrap-layout1"></footer>
          </div>
        </div>
        {/* <!-- Page Area End Here --> */}
      </div>
    </body>
  );
}

export default ParentsDetails;
