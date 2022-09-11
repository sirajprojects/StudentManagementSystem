import React from "react";
import { Outlet, Link } from "react-router-dom";

function examSchedule() {
  return (
    <body>
      {/* <!-- Preloader Start Here --> */}
      <div id="preloader"></div>
      {/* <!-- Preloader End Here --> */}
      <div id="wrapper" className="wrapper bg-ash">
        {/* <!-- Header Menu Area Start Here --> */}
        <div className="navbar navbar-expand-md header-menu-one bg-light">
          <div className="navbar-head">
            <div className="header-logo"></div>
            <div className="toggle-button sidebar-toggle"></div>
          </div>
          <div className="d-md-none mobile-nav-bar">
            <button
              className="navbar-toggler pulse-animation"
              type="button"
              data-toggle="collapse"
              data-target="mobile-navbar"
              aria-expanded="false"
            >
              <i className="far fa-arrow-alt-circle-down"></i>
            </button>
            <button
              type="button"
              className="navbar-toggler sidebar-toggle-mobile"
            >
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
                  <Link to="" className="nav-link">
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
                      <Link to="/admit-form.html" className="nav-link">
                        <i className=""></i>Admission Form
                      </Link>
                    </li>
                    <li className="nav-item">
                      <Link
                        to="/student-profile-update.html"
                        className="nav-link"
                      >
                        <i className=""></i>Profile Update
                      </Link>
                    </li>
                  </ul>
                </li>
                <li className="nav-item sidebar-nav-item">
                  <Link to="/" className="nav-link">
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
                      <Link to="/add-teacher.html" className="nav-link">
                        <i className=""></i>Add Teacher
                      </Link>
                    </li>
                    <li className="nav-item">
                      <Link to="/update-profile.html" className="nav-link">
                        <i className=""></i>Profile Update
                      </Link>
                    </li>
                  </ul>
                </li>

                <li className="nav-item sidebar-nav-item">
                  <Link to="/" className="nav-link">
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
                      <Link to="/add-class" className="nav-link">
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
              <h3>Examination</h3>
              <ul></ul>
            </div>
            {/* <!-- Breadcubs Area End Here -->
                <!-- Exam Schedule Area Start Here --> */}
            <div className="row">
              <div className="col-4-xxxl col-12">
                <div className="card height-auto">
                  <div className="card-body">
                    <div className="heading-layout1">
                      <div className="item-title">
                        <h3>Add New Exam</h3>
                      </div>
                    </div>
                    <form className="new-added-form">
                      <div className="row">
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Exam Name</label>
                          <input
                            type="text"
                            placeholder=""
                            className="form-control"
                          />
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Subject Type *</label>
                          <select className="select2">
                            <option value="">Please Select</option>
                            <option value="1">Bangla</option>
                            <option value="2">English</option>
                            <option value="3">Mathematics</option>
                            <option value="3">Economics</option>
                            <option value="3">Chemistry</option>
                          </select>
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Select Class *</label>
                          <select className="select2">
                            <option value="0">Please Select</option>
                            <option value="1">Play</option>
                            <option value="2">Nursery</option>
                            <option value="3">One</option>
                            <option value="3">Two</option>
                            <option value="3">Three</option>
                          </select>
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Select Section</label>
                          <select className="select2">
                            <option value="0">Please Select</option>
                            <option value="1">A</option>
                            <option value="2">B</option>
                            <option value="3">C</option>
                            <option value="3">D</option>
                            <option value="3">E</option>
                          </select>
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Select Time</label>
                          <input
                            type="text"
                            placeholder=""
                            className="form-control"
                          />
                          <i className="far fa-clock"></i>
                        </div>
                        <div className="col-12-xxxl col-lg-6 col-12 form-group">
                          <label>Select Date</label>
                          <input
                            type="text"
                            placeholder="dd/mm/yyyy"
                            className="form-control air-datepicker"
                          />
                          <i className="far fa-calendar-alt"></i>
                        </div>
                        <div className="col-12 form-group mg-t-8">
                          <button
                            type="submit"
                            className="btn-fill-lg btn-gradient-yellow btn-hover-bluedark"
                          >
                            Save
                          </button>
                        </div>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
              <div className="col-8-xxxl col-12">
                <div className="card height-auto">
                  <div className="card-body">
                    <div className="heading-layout1">
                      <div className="item-title">
                        <h3>All Exam Schedule</h3>
                      </div>
                    </div>
                    <form className="mg-b-20">
                      <div className="row gutters-8">
                        <div className="col-lg-3 col-12 form-group">
                          <input
                            type="text"
                            placeholder="Search by Subject ..."
                            className="form-control"
                          />
                        </div>
                        <div className="col-lg-3 col-12 form-group">
                          <input
                            type="text"
                            placeholder="Search by Date ..."
                            className="form-control"
                          />
                        </div>
                        <div className="col-lg-2 col-12 form-group">
                          <button
                            type="submit"
                            className="fw-btn-fill btn-gradient-yellow"
                          >
                            SEARCH
                          </button>
                        </div>
                      </div>
                    </form>
                    <div className="table-responsive">
                      <table className="table display data-table text-nowrap">
                        <thead>
                          <tr>
                            <th>Exam Name</th>
                            <th>Subject</th>
                            <th>Class</th>
                            <th>Section</th>
                            <th>Time</th>
                            <th>Date</th>
                            <th></th>
                          </tr>
                        </thead>
                        <tbody></tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            {/* <!-- Exam Schedule Area End Here --> */}
            <footer className="footer-wrap-layout1"></footer>
          </div>
        </div>
        {/* <!-- Page Area End Here --> */}
      </div>
    </body>
  );
}

export default examSchedule;
