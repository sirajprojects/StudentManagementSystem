import React from "react"; import { Outlet, Link } from "react-router-dom";

function AdmitForm() {
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
                 <Link to="/">
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
                       <Link to="/admit-form.html" className="nav-link menu-active">
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
                       <Link to="/parents-details.html" className="nav-link">
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
              <h3>Students</h3>
              <ul>
                <li>
                   <Link to="/">Home</Link>
                </li>
                <li>Student Admit Form</li>
              </ul>
            </div>
            {/* <!-- Breadcubs Area End Here -->
                <!-- Admit Form Area Start Here --> */}
            <div className="card height-auto">
              <div className="card-body">
                <div className="heading-layout1">
                  <div className="item-title">
                    <h3>Add New Students</h3>
                  </div>
                </div>
                <form className="new-added-form">
                  <div className="row">
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>First Name *</label>
                      <input type="text" placeholder="" className="form-control" />
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Last Name *</label>
                      <input type="text" placeholder="" className="form-control" />
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Gender *</label>
                      <select className="select2">
                        <option value="">Please Select Gender *</option>
                        <option value="1">Male</option>
                        <option value="2">Female</option>
                        <option value="3">Others</option>
                      </select>
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Date Of Birth *</label>
                      <input
                        type="text"
                        placeholder="dd/mm/yyyy"
                        className="form-control air-datepicker"
                        data-position="bottom right"
                      />
                      <i className="far fa-calendar-alt"></i>
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Roll</label>
                      <input type="text" placeholder="" className="form-control" />
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Blood Group *</label>
                      <select className="select2">
                        <option value="">Please Select Group *</option>
                        <option value="1">A+</option>
                        <option value="2">A-</option>
                        <option value="3">B+</option>
                        <option value="3">B-</option>
                        <option value="3">O+</option>
                        <option value="3">O-</option>
                      </select>
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Religion *</label>
                      <select className="select2">
                        <option value="">Please Select Religion *</option>
                        <option value="1">Islam</option>
                        <option value="2">Hindu</option>
                        <option value="3">Christian</option>
                        <option value="3">Buddish</option>
                        <option value="3">Others</option>
                      </select>
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>E-Mail</label>
                      <input type="email" placeholder="" className="form-control" />
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Class *</label>
                      <select className="select2">
                        <option value="">Please Select Class *</option>
                        <option value="1">Play</option>
                        <option value="2">Nursery</option>
                        <option value="3">One</option>
                        <option value="3">Two</option>
                        <option value="3">Three</option>
                        <option value="3">Four</option>
                        <option value="3">Five</option>
                      </select>
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Section *</label>
                      <select className="select2">
                        <option value="">Please Select Section *</option>
                        <option value="1">Pink</option>
                        <option value="2">Blue</option>
                        <option value="3">Bird</option>
                        <option value="3">Rose</option>
                        <option value="3">Red</option>
                      </select>
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Admission ID</label>
                      <input type="text" placeholder="" className="form-control" />
                    </div>
                    <div className="col-xl-3 col-lg-6 col-12 form-group">
                      <label>Phone</label>
                      <input type="text" placeholder="" className="form-control" />
                    </div>

                    <div className="col-12 form-group mg-t-8">
                      <button
                        type="submit"
                        className="btn-fill-lg btn-gradient-yellow btn-hover-bluedark"
                      >
                        Save
                      </button>
                      <button
                        type="reset"
                        className="btn-fill-lg bg-blue-dark btn-hover-yellow"
                      >
                        Reset
                      </button>
                    </div>
                  </div>
                </form>
              </div>
            </div>
            {/* <!-- Admit Form Area End Here --> */}
            <footer className="footer-wrap-layout1"></footer>
          </div>
        </div>
        {/* <!-- Page Area End Here --> */}
      </div>
    </body>
  );
}

export default AdmitForm;
